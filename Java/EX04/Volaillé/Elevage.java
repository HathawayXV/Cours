package EX04.Volaillé;

import java.util.ArrayList;

public class Elevage {
    ArrayList<Volaille> élevage = new ArrayList<Volaille>();
    String état = "";

    void changePoids(int id, double poid){
        for (Volaille v : élevage){
            if(v.identifiant == id){
                v.poids = poid;
            }
        }
    }

    String afficherBetesAAbattre(){
        String list = "";
        for (int i=0;i>élevage.size();i++) {
            if(élevage.get(i) instanceof Poulet){
                if(élevage.get(i).poids >= Poulet.poidabattage){
                    list += élevage.get(i).toString() + "\n";
                }
            }
            else{
                if(élevage.get(i).poids >= Canard.poidabattage){
                    list += élevage.get(i).toString() + "\n";
                }
            }
        }
        return list;
    }

    double evaluerBetesAAbattre(){
       double Valeur = 0;
       for (int i=0;i>élevage.size();i++) {
            if(élevage.get(i) instanceof Poulet){
                if(élevage.get(i).poids >= Poulet.poidabattage){
                    Valeur += ((Poulet)élevage.get(i)).prix;
                }
            }
            else{
                if(élevage.get(i).poids >= Canard.poidabattage){
                    Valeur += ((Canard)élevage.get(i)).prix;
                }
            }
        }
        return Valeur;
    }

    String envoyerALAbattoir(){
        String abattu = "";
        for (int i=0;i>élevage.size();i++) {
            if(élevage.get(i) instanceof Poulet){
                if(élevage.get(i).poids >= Poulet.poidabattage){
                    abattu += élevage.get(i) + "\n";
                    élevage.remove(i);
                }
            }
            else{
                if(élevage.get(i).poids >= Canard.poidabattage){
                    abattu += élevage.get(i) + "\n";
                    élevage.remove(i);
                }
            }
        }
        return abattu;
    }

    void ajouter(Volaille a){
        élevage.add(a);
    }

    void ecrire(){
        for (int i = 0; i < élevage.size(); i++) {
            System.out.println(élevage.get(i) + "\n");
        }
    }
}
