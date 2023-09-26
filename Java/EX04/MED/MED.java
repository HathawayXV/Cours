package EX04.MED;

import java.util.ArrayList;

class SocieteMed {
    ArrayList<Vehicule> Vehicules = new ArrayList<Vehicule>();

    void ajouterVehicule(Vehicule v) {
        Vehicules.add(v);
    }

    int calculerCout(){
        int cout = 0;
        for(int i=0;i<Vehicules.size();i++){
            if(Vehicules.get(i).numeroIntervention != 0){
                Vehicule temp = Vehicules.get(i);
                if(temp instanceof VA){
                    cout += 300;
                }
                if(temp instanceof VS){
                    if(temp.distance >= 50){
                        cout += 600;
                    }
                    else if (((VS)temp).place2 != ""){
                        cout += 2*150;
                    }
                    else{
                        cout += 150;
                    }
                }
                if(temp instanceof PC){
                    cout += 1000;
                }
            }
        }
        return cout;
    }
}

public class MED {
    public static void main (String args []) {
        SocieteMed s = new SocieteMed();

        // Créer les véhicules
        PC pc1 = new PC ();
        PC pc2 = new PC ();
        VS vs1 = new VS ();
        VS vs2 = new VS ();
        VS vs3 = new VS ();
        VA va1 = new VA ();
        VA va2 = new VA ();

        // Ajouter les véhicules à la société
        s.ajouterVehicule (pc1);
        s.ajouterVehicule (pc2);
        s.ajouterVehicule (vs1);
        s.ajouterVehicule (vs2);
        s.ajouterVehicule (vs3);
        s.ajouterVehicule (va1);
        s.ajouterVehicule (va2);

        // Affecter qq véhicules à une intervention
        int numeroIntervention = 17 ;
        int distance = 35 ;
        pc1.affecterIntervention (numeroIntervention, distance);
        vs1.affecterIntervention (numeroIntervention, distance);
        vs2.affecterIntervention (numeroIntervention, distance);
        va2.affecterIntervention (numeroIntervention, distance);

        // Lors de l'intervention, embarquer quelques personnes
        vs1.embarquer("Dupont");
        vs2.embarquer("Martin", "Durand");

        // Afficher les informations sur tous les véhicules
        System.out.println (s);

        // Calculer le cout de l'intervention
        System.out.println ("Cout total de la journée : " + s.calculerCout());
    }
}
