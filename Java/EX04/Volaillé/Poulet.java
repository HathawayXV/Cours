package EX04.Volaillé;

public class Poulet extends Volaille {
    double prix = 0;
    static double prixOkilo = 0;
    static double poidabattage = 20.0;

    Poulet(Double p, int id){
        this.poids = p;
        this.identifiant = id;
        this.prix =  super.prix(p, prixOkilo);
    }
}
