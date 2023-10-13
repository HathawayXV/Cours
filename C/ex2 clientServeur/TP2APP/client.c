/* CLIENT. Donner l'adresse IP et un pseudo en paramètre */
/* exemple "client 127.0.0.1 dr.ced", lancer en dernier. */

#include <stdio.h>             /* fichiers d'en-tête classiques */
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <errno.h>

#include <sys/socket.h>        /* fichiers d'en-tête "réseau" */
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>

#define PORT_SERVEUR 5015      /* Numéro de port pour le serveur */
#define BUFFER_SIZE  1024      /* Taille maximum des messages */

int main(int argc, char *argv[]) {
  char msg[BUFFER_SIZE] = {0};
  struct sockaddr_in saddr = {0};
  int oct = 0;
  int len = strlen(argv[2]);
  /* 1. On crée la socket du client. */
  int sc = socket(AF_INET, SOCK_STREAM, 0);
  if (sc == -1) {
    perror("error socket()");
    exit(1);
  }
  if(argc != 3){
    printf("argument invalide");
    exit(1);
  }
  /* 2. On prépare l'adresse du serveur. */
  saddr.sin_family = AF_INET;
  saddr.sin_port = htons(PORT_SERVEUR);
  saddr.sin_addr.s_addr = inet_addr(argv[1]);
  /* 3. On demande une connexion au serveur, tant qu'on y arrive pas. */
  while (connect(sc, (struct sockaddr *) &saddr, sizeof(saddr)) == -1);
  /* 4. On communique. */ 
  pid_t id = fork();
  if(id == 0){
      while(1){
        oct = read(sc, msg, BUFFER_SIZE);
        if(oct <= 0){
          break;
        }
        write(1, msg, oct);
      }
    shutdown(sc,SHUT_RDWR);
    close(sc);
    exit(0);
  }
  
  strcpy(msg, argv[2]);
  msg[len] = ':';
  msg[len+1] = ' ';
  len += 2;
  while (1) {
    oct = read(0, msg + len, sizeof(msg) - len);
    if(oct <= 0){
      break;
    }
    write(sc, msg, len + oct);
  }
  
  /* 5. On termine et libère les ressources. */
  shutdown(sc,SHUT_RDWR);
  close(sc);
  return 0;
}
