/**
 * Stock
 */
public class Stock {

    public static void main(String[] args) {
        //constante
        final int NB_ARTICLES= 3;

        //déclarer tableau
        char ARTICLES [];
        double PRIX [];

        //allouer les tableaux avec une taille max définie en constante
        ARTICLES = new char [NB_ARTICLES];
        PRIX = new double [NB_ARTICLES];

        //mettre les valeurs dans les cases
        PRIX[0]=10.5;
        PRIX[1]=2.5;
        PRIX[2]=21.5;
        ARTICLES[0]='A';
        ARTICLES[1]='B';
        ARTICLES[2]='C';

        //parcourir
        System.out.println("Parcours successif des tableaux avec deux boucle : ");
        for(char valeur : ARTICLES){
            System.out.print(valeur + "    ");
        }
        System.out.println();
        for(double valeur : PRIX){
            System.out.print(valeur + " ");
        }
        System.out.println();

        //parcourir avec un while et boolean
        boolean fini = false;
        int i = 0;
        System.out.println("Parcours successif des tableaux avec un while et boolean : ");
        while(!fini){
            System.out.print(ARTICLES[i] + " - ");
            System.out.println(PRIX[i] + "e");
            i++;
            fini = i == NB_ARTICLES;
        }

        //Parcourir avece un for
        System.out.println("Parcours successif des tableaux avec un for : ");
        for(int y=0;y<ARTICLES.length;y++){
            System.out.println(ARTICLES[y] + " - " + PRIX[y] +  "e");
        }

    }
}
