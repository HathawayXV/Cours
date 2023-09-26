package EX03;

public class Compte {
    static int Compteur;
    private int Numero = 00;
    private double Solde;
    private int Seuil_Decouvert = 0;
    private Client Clt;
    private static final int Seuil_Securité = 1000;

    Compte(double solde){
        solde = testSolde(solde);
        this.Solde=solde;
        this.Numero=Compteur;
        Compteur++;
    }

    Compte(double solde, Client c){
        solde = testSolde(solde);
        this.Solde=solde;
        this.Clt=c;
        this.Numero=Compteur;
        Compteur++;
    }

    /*Compte(int solde, Client c, int num){
        solde = testSolde(solde);
        this.Numero=num;
        this.Solde=solde;
        this.Clt=c;
        Compteur++;
    }*/

    void crediter(int n){
        double add = n + (n*(Banque.TauxRemuneration));
        Solde += add;
        System.out.println("Solde: "+ Solde + '\n');
    }

    void debiter(int n){
        if(n-Solde>Seuil_Decouvert){
            System.out.println("Vous avez atteint le Seuil limite. \nVotre Seuil limite de decouvert est de " + Seuil_Decouvert + ". \nVotre solde est de : " + Solde + ".");
        }
        else{
            Solde -= n;
            System.out.println("Solde: "+ Solde);
        }
    }

    String getname(){
        return Clt.getname();
    }

    double getsolde(){
        return Solde;
    }

    int getnum(){
        return Numero;
    }

    void information(){
        System.out.println("Nom : " + getname() + "\nNumero de compte : " + Numero + "\nSolde : " + Solde);
    }

    double testSolde(double n){
        if(n>Seuil_Securité){
            System.out.println("ATTENTION tentative d affectation suspecte d un nouveau solde : compte no "+Numero);
            return 0;
        }
        return n;
    }

    public String toString(){
        String s ="";
        s = s + "Numero : " + Numero + "\nSolde : " + Solde + "\nSeuil decouvert : " + Seuil_Decouvert + "\nClient : " + Clt.getname() + '\n';
        return s;
    }

    public static void main(String[] args) {
    }
}
