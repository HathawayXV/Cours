package EX03;

public class Banque {
    String Name = "Banque";
    Compte CompT[];
    epargne eT[];
    static double TauxRemuneration = 0.02;

    //Deux constructeur
    Banque(epargne t[]){
        this.eT = t;
    }
    Banque(Compte t[]){
        this.CompT = t;
    }
    Banque(Compte t[], epargne y[]){
        this.CompT = t;
        this.eT = y;
    }

    public String toString(){
        String s ="";
        s = s + "\nNom : " + Name + "\nCompte a disposition : " + CompT.length + "\nepargne à disposition : " + eT.length +'\n';
        return s;
    }

    //recherche a partir du nom
    void recherche(String a){
        int ind=0;
        while(ind<CompT.length&&CompT[ind].getname()!=a){
            ind++;
        }
        if(ind!=CompT.length-1){
            System.out.println("Nom :" + CompT[ind].getname() + "\nNumero compte : " + CompT[ind].getnum() + "\nSolde : " + CompT[ind].getsolde());
        }
        else{
            System.out.println("Le nom que vous cherché n'existe pas.");
        }
    }

    //Recherche à partir du numéro de compte
    void rechercheNum(int a){
        int ind=0;
        while(ind<CompT.length&&CompT[ind].getnum()!=a){
            ind++;
        }
        if(ind!=CompT.length-1){
            System.out.println("Nom :" + CompT[ind].getname() + "\nNumero compte : " + CompT[ind].getnum() + "\nSolde : " + CompT[ind].getsolde());
        }
        else{
            System.out.println("Le nom que vous cherché n'existe pas.");
        }
    }

    public static void main(String[] args) {

        //initialisation des client et compte
        Client C1 = new Client("Julien", "1 Rue de la Rue");
        Compte Comp1 = new Compte(1000, C1);
        Client C2 = new Client("Robbie", "2 Rue de la Rue");
        Compte Comp2 = new Compte(908, C2);
        Client C3 = new Client("Antoine", "3 Rue de la Rue");
        Compte Comp3 = new Compte(980, C3);
        Client C4 = new Client("Alexis", "5 Rue de la Rue");
        Compte Comp4 = new Compte(190, C4);
        Client C5 = new Client("Elisa", "6 Rue de la Rue");
        Compte Comp5 = new Compte(1, C5);
        Client C6 = new Client("Nathan", "6 Rue de la Rue");
        Compte Comp6 = new Compte(1000, C6);

        //test créditation
        Comp1.crediter(100);

        //creation des tableaux client et Compt
        Compte CompT[] = new Compte[5];
        Banque B1 = new Banque(CompT);
        Compte CompTe[] = new Compte[5];
        Banque B2 = new Banque(CompTe);

        //Affectation des valeurs
        B1.CompT[0] = Comp1;
        B1.CompT[1] = Comp2;
        B2.CompT[0] = Comp3;
        B2.CompT[1] = Comp4;
        B2.CompT[2] = Comp5;
        B2.CompT[3] = Comp6;

        //affiche les valeurs B1
        int valeur = 0;
        while(valeur<CompT.length&&CompT[valeur]!=null){
            System.out.println("Notre client est : "+B1.CompT[valeur].getname());   
            valeur++;
        }
        System.out.println();
        //affiche les valeurs B2
        valeur = 0;
        while(valeur<CompT.length&&CompT[valeur]!=null){
            System.out.println("Notre client est : "+B2.CompT[valeur].getname());   
            valeur++;
        }

        //afficher les informations a partir de son nom
        System.out.println();
        String a = "Elisa";
        B2.recherche(a);

        //----- a partir de son numéro de compte
        System.out.println();
        int b = 3;
        B2.rechercheNum(b);

        //création d'un compte d'epargne pour élisa
        System.out.println();
        epargne E1 = new epargne(0, 0.01, C5);
        E1.crediter(100);
        System.out.println("Dans l'épargne nous avons : " + E1.getsolde());
        
        //creation du tableau d'épargne dans la banque
        System.out.println();
        epargne E2 = new epargne( 0, 0.02, C6);
        epargne tabe[] = new epargne[5];
        Compte tabc[] = new Compte[5];
        Banque B3 = new Banque(tabc, tabe);

        //insertion des valeurs
        B3.CompT[0]=Comp4;
        B3.CompT[1]=Comp5;
        B3.CompT[2]=Comp6;
        B3.eT[0]=E1;
        B3.eT[1]=E2;

        //toString
        System.out.println(E1);
        System.out.println(Comp1);
        System.out.println(C1);
        System.out.println(B3);

        
        
    }
}