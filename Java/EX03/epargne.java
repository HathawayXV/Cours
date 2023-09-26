package EX03;

public class epargne {
    static int Compteur;
    int Numero;
    double Solde;
    double tauxInteret;
    Client Client;

    epargne(double solde, double taux, Client cl){
        this.Numero = Compteur;
        this.Solde = solde;
        this.tauxInteret = taux; 
        this.Client = cl;
        Compteur++; 
    }

    double getsolde(){
        return Solde;
    }

    void crediter(int n){
        double add = n + (n*(tauxInteret));
        Solde += add;
        System.out.println("Solde: "+ Solde + '\n');
    }

    public String toString(){
        String s ="";
        s = s + "Numero : " + Numero + "\nSolde : " + Solde + "\nTaux d'interet : " + tauxInteret + "\nClient : " + Client.getname() + '\n';
        return s;
    }

    public static void main(String[] args) {
    }
}
