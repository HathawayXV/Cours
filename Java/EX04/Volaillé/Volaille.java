package EX04.Volaillé;

public class Volaille {
    double poids;
    int identifiant;

    double getid(){
        return identifiant;
    }

    double prix(double poid, double pOk){
        double prix = poid * pOk;;
        return prix;
    }
}
