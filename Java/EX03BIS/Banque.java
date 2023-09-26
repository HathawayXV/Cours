package EX03BIS;

import java.util.ArrayList;

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
            ArrayList<Compte> list = new ArrayList<Compte>();
            list.add(Comp1);
            list.add(Comp2);
            list.add(Comp3);
            list.add(Comp4);
            list.add(Comp5);
            list.add(Comp6);

            //affiche les valeurs B1
            System.out.println(list);
        }
}