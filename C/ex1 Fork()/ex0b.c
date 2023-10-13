#include <stdio.h>

void echange2(float* a, float* b) {
    float temp = *a; //valeur temp prend le pointeur de A
    *a = *b; //échanger les pointeurs
    *b = temp; //pointeur de b prend pointeur de temp
}

int main() {
    float pi = 2.71828, e = 3.14159;
    printf("Avant echange : pi = %f, e = %f.\n",pi,e);
    echange1(&pi,&e);
    printf("Apres echange : pi = %f, e = %f.\n",pi,e);
    return 0;
}

//Qu’affiche ce programme ? Expliquez.
//Avant echange : pi = 2.718280, e = 3.141590.
//Apres echange : pi = 2.718280, e = 3.141590.