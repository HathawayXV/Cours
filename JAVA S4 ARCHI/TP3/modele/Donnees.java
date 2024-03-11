package TP3.modele;

/**
 * Donnees
 */
public class Donnees {

    private String nom;
    private double minConso;
    private double maxConso;

    public Donnees(String nom, double minConso, double maxConso) {
        this.nom = nom;
        this.minConso = minConso;
        this.maxConso = maxConso;
    }

    public String getNom() {
        return nom;
    }

    public double getMinConso() {
        return minConso;
    }

    public double getMaxConso() {
        return maxConso;
    }
}