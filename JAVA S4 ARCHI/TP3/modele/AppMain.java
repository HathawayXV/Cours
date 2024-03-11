package TP3.modele;

import java.util.ArrayList;

import TP3.presentation.*;

public class AppMain {
    ArrayList<Donnees> donnees = new ArrayList<Donnees>();

    public static void main(String[] args) {
        AppMain app = new AppMain();
        app.start();
    }

    public void start(){
        Donnees voiture = new Donnees("Voiture", 4.5, 20);
        Donnees covoiturage = new Donnees("Co-Voiturage", 2, 10);
        Donnees velo = new Donnees("Velo", 0.001, 0.22);
        Donnees transport = new Donnees("Transport en commun", 0.2, 1.0);
        Donnees autre = new Donnees("Autre", 0.0, 20);
        donnees.add(voiture);
        donnees.add(covoiturage);
        donnees.add(velo);
        donnees.add(transport);
        donnees.add(autre);
        Presentation fenetre = new Presentation(this);
    }

    public ArrayList<Donnees> getDonnees() {
        return donnees;
    }
}
