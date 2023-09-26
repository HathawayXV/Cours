
//import java.util.Scanner;
public class Trois {
    public static void main(String[] args) {

        ///Constante
        final int tabsize = 3;

        ///declaration tab
        float tab [];
        tab = new float[tabsize];

        ///set value
        char a='A';
        char b='B';

        ///set indice
        indice(tab);

        ///modifier la valeur
        int C = 0;
        modifier(C, tab);

        ///echanger deux valeur float
        tab[1]=10.2f;
        tab[2]=23.6f;
        echangerfloat(tab[0], tab[1]);
        System.out.println();
        echangerDeuxFloatDansTableau(tab);

        ///methode échanger
        //echanger(a, b);
        
        ///afficher le tableau
        /*System.out.println();
        for(float valeur : tab){
            System.out.print(valeur + " ");
        }

        System.out.println(a + " " + b);*/

    }

    static void echanger(char a, char b){
            System.out.println("First char = " + a + " second one is = " + b);
            char temp = a;
            a = b;
            System.out.println("First char = " + a + " second one is = " + b);
            b = temp;
            System.out.println("First char = " + a + " second one is = " + b);
    }

    static void indice(float [] tableau){
        System.out.println("tab [0] = " + tableau[0]);
        tableau[0]=150.7f;
        System.out.println("tab [0] = " + tableau[0]);
    }

    static void modifier(int indice, float [] tab){
        System.out.println("tab [" + indice + "] = " + tab[indice]);
        tab[indice]=0.0f;
        System.out.println("tab [" + indice + "] = " + tab[indice]);
    }

    static void echangerfloat(float a, float b){
        System.out.println("First float = " + a + " second one is = " + b);
        float temp = a;
        a = b;
        System.out.println("First float = " + a + " second one is = " + b);
        b = temp;
        System.out.println("First float = " + a + " second one is = " + b);
    }

    static void echangerDeuxFloatDansTableau(float[] tabFloat){
        float temp = tabFloat[0];
        System.out.println("First float = " + tabFloat[0] + " second one is = " + tabFloat[1]);
        tabFloat[0] = tabFloat[1];
        System.out.println("First float = " + tabFloat[0] + " second one is = " + tabFloat[1]);
        tabFloat[1] = temp;
        System.out.println("First float = " + tabFloat[0] + " second one is = " + tabFloat[1]);
    }
}
