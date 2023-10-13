/* SERVEUR. Lancer ce programme en premier (pas d'arguments). */

#include <stdio.h>                  /* fichiers d'en-tête classiques */
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <signal.h>
#include <string.h>
#include <fcntl.h>
#include <errno.h>

#include <sys/socket.h>             /* fichiers d'en-tête "réseau" */
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>

#define PORT_SERVEUR 5015           /* Numéro de port pour le serveur */
#define MAX_CLIENTS   128           /* Nombre maximum de clients */
#define BUFFER_SIZE  1024           /* Taille maximum des messages */

int main(int argc, char *argv[]) {
  struct sockaddr_in saddr = {0};
  char msg[BUFFER_SIZE] = {0};
  fd_set master, temp;
  /* 1. On déroute les signaux */
  signal(SIGTERM, SIG_IGN);
  /* 2. On crée la socket d'écoute. */
  int se = socket(AF_INET, SOCK_STREAM, 0);
  int max = se;
  /* 3. On prépare l'adresse du serveur. */
  saddr.sin_family = AF_INET; 
  saddr.sin_addr.s_addr = htonl(INADDR_ANY);
  saddr.sin_port = htons(PORT_SERVEUR);
  if (bind(se, (struct sockaddr *) &saddr, sizeof(saddr)) == -1){
    perror("erreur de bind(): "); return 1;
  }
  /* 4. On attache la socket a l'adresse du serveur. */
  FD_ZERO(&master);
  FD_SET(se, &master);
  /* 5. Enregistrement auprès du système. */
  listen(se, 5);
  while (1) {
    printf("Serveur en attente de nouveaux clients ou messages.\n");
    printf("%s", msg);
    temp = master;
    select(max+1, &temp, NULL,NULL,NULL);
    for(int i = 0; i<=max; i++){
      if(!FD_ISSET(i, &temp))
        continue;
    /* 6. Si on a reçu une demande sur la socket d'écoute... */
      if (i==se){
        int ss = accept(se, NULL, NULL);
        FD_SET(ss, &master);
        if(ss > max)
          max = ss;
        continue;
      }
      int nb = read(i, msg, sizeof(msg));
      if(nb == 0){
        FD_CLR(i, &master);
        shutdown(i, SHUT_RDWR);
        close(i);
        continue;
      }
    /* 7. Si on a reçu des données sur une socket de service... */
      for(int j = 0; j<=max; j++){
        if(!FD_ISSET(j, &master)||j==se||j==i)
          continue;
        write(j, &msg, nb);
      }
    }
  }
  /* 8. On termine et libère les ressources. */
  shutdown(se, SHUT_RDWR);
  close(se);
  return 0;
}
