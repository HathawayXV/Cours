package EX04.Volaillé;

public class Canard extends Volaille {
    double prix = 0;
    static double prixOkilo = 2.0;
    static double poidabattage = 30.0;

    Canard(Double p, int id){
        this.poids = p;
        this.identifiant = id;
        this.prix =  super.prix(p, prixOkilo);
    }
}
