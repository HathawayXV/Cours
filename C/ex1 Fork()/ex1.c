#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <sys/wait.h>


int main(){
    int TABSIZE = 10000;
    int i = 0;
    unsigned char arr[TABSIZE];
    int status = 0;

    srandom(time(NULL));
    // entasser du foin
    for (i = 0; i <= TABSIZE; i++)
    arr[i] = (unsigned char) (random() % 255) + 1;
    // cacher l'aiguille

    printf("Enter a number between 0 and %d:\n", TABSIZE);
    scanf(" %d", &i);
    printf("Première valeur l'arraylist: %d:\n", arr[0]);
    if (i >= 0 && i <= TABSIZE) arr[i] = 0;

    int res = 0;
    pid_t id = fork();
    if (id == 0){
        for (int j = TABSIZE/2 ; j <= TABSIZE ; j++){
            if (arr[j] == 0){
                res = 1;
                printf("Trouver dans le fils dans la sur la valeur j = %d \n", j);
                exit(res);
            }
        }
        exit(res); //mécanisme pour passer du père ou fils
    }

    for (int y = 0 ; y <= TABSIZE/2 ; y++){
        if (arr[y] == 0){
            res = 1;
            printf("Trouver dans le père dans la sur la valeur y = %d \n", y);
        }
    }
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
