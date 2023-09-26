package EX05.salarier;

abstract public class salarie {
    double salaire = 0;

    public double getSalaire() {
        return salaire;
    }

    abstract void verserSalaire();

    public static void main(String[] args) {
        Compte c1 = new Compte(1, 2);
        ClientInterne Comp1 = new ClientInterne(c1, 1234);
        Compte c2 = new Compte(2, 430);
        ClientInterne Comp2 = new ClientInterne(c2, 3000);
        Compte c3 = new Compte(3, 3283);
        ClientInterne Comp3 = new ClientInterne(c3, 4050);
        Compte c4 = new Compte(4, 3289);
        ClientInterne Comp4 = new ClientInterne(c4, 39943);

        System.out.println(Comp1);
        Comp1.verserSalaire();
        System.out.println(Comp1);

        System.out.println(Comp2);
        Comp2.verserSalaire();
        System.out.println(Comp2);

        System.out.println(Comp3);
        Comp3.verserSalaire();
        System.out.println(Comp3);

        System.out.println(Comp4);
        Comp4.verserSalaire();
        System.out.println(Comp4);
    }
}

/**
 * ClientInterne
 */
class ClientInterne extends salarie{
    Compte compte;

    ClientInterne(Compte a, double sal){
        this.compte = a;
        salaire = sal;
    }

    void verserSalaire(){
        compte.ajouterSolde(salaire);
    }

    void getcompte(){
        System.out.println("Numéro de compte : " + compte.getcomptes() + "\nSolde : " + compte.getsolde());
    }

    public String toString(){
        String s ="";
        s = s + "\nNum : " + compte.Numérocompte + "\nsolde : " + compte.solde +'\n';
        return s;
    }
}

class Compte{
    int Numérocompte = 1;
    double solde = 0;

    Compte(int numero, double sold){
        this.Numérocompte = numero;
        this.solde = sold;
    }

    void ajouterSolde(double salaire){
        solde += salaire;
    }

    int getcomptes(){
        return Numérocompte;
    }

    double getsolde(){
        return solde;
    }
}

class Employe extends salarie{
    void verserSalaire(){
        System.out.println("salaire verser");
    }
}
