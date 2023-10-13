#include <stdio.h>

int main(){
    double valeur = 10.0;
    double *pv = &valeur;
    int nombre = 1, *pn;
    pn = &nombre;
    valeur = *pv + *pn;
    printf(" valeur = %f\n", valeur);
    printf(" valeur = %zu\n", sizeof(valeur));
    printf("&valeur = %p\n", &valeur);
    printf(" valeur = %zu\n", sizeof(pv));
    printf(" valeur = %zu\n", sizeof(pn));
    printf(" valeur = %zu\n", sizeof(nombre));
    return 0;
}

//Que représente valeur ? Qu’affiche le premier printf() ?
//valeur = 11.000000

//Que représente &valeur ? Qu’affiche le premier printf() ?
//&valeur = 0x7ffea02feb38

//Que représente pv ? Que représente &pv ? Que représente *pv ?
//pv = un pointeur vers l'adresse de valeur, &pv = L'adresse du pointeur, *pv = la valeur du pointeur

//Quelle est la taille de la zone mémoire réservée pour valeur ? Pour pv ? Pour nombre ? Pour pn ?
//taille valeur : 8 Bits
//taille pv : 8 Bits
//taille pn : 8 Bits
//taille nombre : 4 Bits

//Pourquoi les tailles sont-elles différentes pour valeur et nombre, mais identiques pour pv et pn ?
//Pour valeur et nombre, int est sous 4 bits tandis que double est sous 8 bits
//Pour pv et pn, les deux sont des adresses donc les deux sont sous 8 bits