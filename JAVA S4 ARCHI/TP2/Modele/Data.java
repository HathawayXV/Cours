package TP2.Modele;

public class Data {

    private String nom;
    private double minConso;
    private double maxConso;

    public Data(String nom, double minConso, double maxConso) {
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
