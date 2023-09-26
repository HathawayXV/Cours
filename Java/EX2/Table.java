/**
 * Table
 */
public class Table {
    int NbPied;
    String Couleur;
    double Prix;
    final static String NOIR ="Noir";
    Table(){
        Couleur = "Marron";
        NbPied = 4;
    }
    Table(int pied){
        this.NbPied = pied;
        this.Couleur = "Marron";
    }
    Table(int pied, String couleur){
        this.NbPied = pied;
        this.Couleur = couleur;
    }
    public static void main(String[] args) {
        /*Table T1 = new Table();
        System.out.println("Nombre de pied : " +T1.NbPied +"\nCouleur : "+ T1.couleur +"\nPrix : "+ T1.prix);*/
        Table t = new Table (); // constructeur
    	System.out.println (t.NbPied);
    	System.out.println (t.Couleur);
    	System.out.println (t.Prix);
    	System.out.println ();
   	 
    	Table t2 = new Table (3);
    	System.out.println (t2.NbPied);
    	System.out.println (t2.Couleur);
    	System.out.println (t2.Prix);
    	System.out.println ();
   	 
    	Table t3 = new Table (6, Table.NOIR);
    	System.out.println (t3.NbPied);
    	System.out.println (t3.Couleur);
    	System.out.println (t3.Prix);
    	System.out.println ();

        //changer une valeur a partir d'une adresse
        Table t4 = new Table();
        t4 = t3;
        t3.Prix = 80;
        System.out.println("Le prix de t4 = " + t4.Prix + '\n');

        //tableau d'une table
        t.Prix = 20;
        double somme = 0;
        Table t5 [];
        t5 = new Table[4];
        t5[0]=t;
        t5[1]=t2;
        t5[2]=t3;

        for (int valeur=0;valeur<t5.length;valeur++){
            if(t5[valeur]!=null){
                System.out.println("Le prix de t" + valeur +" = " + t5[valeur].Prix);
                somme+=t5[valeur].Prix;
            }
            else{
                System.out.println("t"+valeur+" n'a pas de prix");
            }
            System.out.println("la somme est de " + somme);
        }

    }
}