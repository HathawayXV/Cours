#include <sys/socket.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <unistd.h>
#include <sys/wait.h>

int main(){
    double value = 0;

    double x = 0;
    double y = 0;
    int M = 0;
    int N = 0;
    int size = 0;
    char c; 

    int tds[2];
    socketpair(AF_LOCAL, SOCK_STREAM, 0,tds);
    pid_t id = fork();
    if(id == 0){
        close(tds[0]);
        while (1){
            size = read(tds[1], &c, 1);
            if(size <= 0){
                break;
            }
            value = ((double)random()/RAND_MAX);
            write(tds[1], &value, sizeof(value));
        }
        shutdown (tds[1], SHUT_RDWR);
        close(tds[1]);
        exit(0);
    }

    close(tds[1]);
    while (1){
        write(tds[0], "ab", 2);
        size = read(tds[0], &x, sizeof(value));
        size = read(tds[0], &y, sizeof(value));
        N++;
        if (size <= 0){
            break;
        }
        if(x*x+y*y<=1){
                //printf("Père = %d\n", size);
                M++;
        }
        printf("pi = %f\n", (4.0*M)/N);
    }
    shutdown(tds[0], SHUT_RDWR);
    close(tds[0]);
    printf("Père %f\n", value);
    exit(0);
}

