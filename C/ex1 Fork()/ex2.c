#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <sys/wait.h>


int main(int argc, char ** argv){
    int TABSIZE = 10000;
    int i = 0;
    unsigned char arr[TABSIZE];
    int status = 0; //valeur a la récéption
    int N = 0; //valeur de processus
    int res = 0; //valeur de résultat

    if (argc > 1) N = atoi(argv[1]);

    srandom(time(NULL));
    // entasser du foin
    for (i = 0; i <= TABSIZE; i++)
    arr[i] = (unsigned char) (random() % 255) + 1;
    // cacher l'aiguille

    printf("Enter a number between 0 and %d:\n", TABSIZE);
    scanf(" %d", &i);
    printf("Première valeur l'arraylist: %d:\n", arr[0]);
    if (i >= 0 && i <= TABSIZE) arr[i] = 0;

    for(int p = 0 ; p < N ; p++){
        pid_t id = fork();
        if (id == 0){
        for (int j = (p*TABSIZE)/N ; j < (p+1)*TABSIZE/N ; j++){
            if (arr[j] == 0){
                res = 1;
                printf("0 Trouver dans le fils dans la sur la valeur j = %d dans le fils : %d \n", j, p);
                exit(res);
            }
        }
        exit(res); //mécanisme pour passer du père ou fils
        }
    }

    /*for (int y = 0 ; y <= TABSIZE/2 ; y++){
        if (arr[y] == 0){
            res = 1;
            printf("Trouver dans le père dans la sur la valeur y = %d \n", y);
        }
    }*/
    wait(&status);

    if(WIFEXITED(status)){ //mécanisme pour passer du père ou fils
        if(WEXITSTATUS(status) == 1){
            res = 1;
        }
    }
    printf("%d", res);
    return 0;
}


//À quoi sert l’instruction srandom(time(NULL)) ?
//il sert a initialiser une valeur aléatoire.

//Combien de zéros, au minimum et au maximum, peuvent apparaitre dans le tableau à la fin de ce fragment de code ? Justifiez la réponse.
