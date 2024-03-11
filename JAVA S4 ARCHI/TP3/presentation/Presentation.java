package TP3.presentation;

import java.util.ArrayList;
import TP3.modele.*;
import TP3.vue.UIHandler;

public class Presentation implements IPresentation{

    UIHandler fenetre;
    AppMain appMain;

    ArrayList<Donnees> donnees;
    ArrayList<Integer> quantites;

    String typeDep = null;

    public Presentation(AppMain appMain){
        fenetre = new UIHandler(this);
        this.appMain = appMain;
        donnees = appMain.getDonnees();
    }

    public String getBilan(Donnees type){
        double Vegan = quantites.get(0) * 0.4;
        double Vegetarien = quantites.get(1) * 0.5;
        double Boeuf = quantites.get(2) * 7;
        double Autre = quantites.get(3) * 1.1;

        double total = Vegan + Vegetarien + Boeuf + Autre;

        quantites.clear();

        double min = type.getMinConso()+total;
        double max = type.getMaxConso()+total;

        return "Vous émettez entre " + min + " et " + max + " kg de CO2 par km.";
    }

    public void changePanel(String type){
        if(type == "ACTION_COMMENCER"){
            fenetre.changePanel(null);
        }
        else if(type == "ACTION_RECOMMENCER"){
            Donnees restart = new Donnees("restart", -1.0, -1.0);
            fenetre.changePanel(restart);
        }
        else {
            typeDep = type;
            fenetre.changePanel(null);
        }
    }

    public void changePanel(ArrayList<Integer> quantite){
        this.quantites = quantite;
        for(Donnees donnee : donnees){
            if(donnee.getNom().equals(typeDep)){
                System.out.println(donnee.getNom());
                fenetre.changePanel(donnee);
            }
        }
        typeDep = null;
    }

    public String getModel(){
        return "";
    }
}
