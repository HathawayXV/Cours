package EX04.MED;

public class Vehicule {
    int id = 100;
    int numeroIntervention = 0;
    int distance = 0;

    void affecterIntervention(int intervention, int distance) {
        numeroIntervention = intervention;
        this.distance = distance;
    }
}

class Engins extends Vehicule{
    String NomPersonne1 = "";
    String HopitalDestination = "";
}

class PC extends Vehicule{
    int cout = 1000;
}
