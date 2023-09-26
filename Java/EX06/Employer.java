package EX06;

import java.util.ArrayList;

import EX05.salarier.salarie;

public abstract class Employer {
    String nom = "";
    String prenom = "";
    int age = 0;
    int annee_debut = 0;

    abstract double calculSalaires();
    String getNom(){
        String a = "L'employé " + nom + " " + prenom;
        return a;
    }

    public static void main(String[] args) {
        representant r = new representant("Maxime", "Miséré", 18, 2005, 14959);
        System.out.println(r.getNom());
        System.out.println(r.calculSalaires());
        TechnicienARisque l = new TechnicienARisque("Adrien", "Henry", 19, 2008, 1043);

    }
}

/**
 * ARisque
 */
interface ARisque {
    double prime = 250.0;
}

/**
 * Technicien
 */
class Technicien extends Employer{
    double unite_produit = 0;
    ArrayList<TechnicienARisque> Employer_a_risque = new ArrayList<TechnicienARisque>();

    Technicien(String nom, String prenom, int age, int annee_debut, int unite_produit){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.annee_debut = annee_debut;
        this.unite_produit = unite_produit;
    }

    @Override
    double calculSalaires() {
        return unite_produit*10;
    }
}

/**
 * TechnicienARisque
 */
class TechnicienARisque extends Technicien implements ARisque{
    TechnicienARisque(String nom, String prenom, int age, int annee_debut, int unite_produit){
        super(nom, prenom, age, annee_debut, unite_produit);
    }

    double calculSalaires() {
        double salaire = (unite_produit*10)+prime;
        return salaire;
    }
}

/**
 * Manutentionnaire
 */
class Manutentionnaire extends Employer{
    double nb_heure= 0;

    Manutentionnaire(String nom, String prenom, int age, int annee_debut, int nb_heure){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.annee_debut = annee_debut;
        this.nb_heure = nb_heure;
    }

    @Override
    double calculSalaires() {
        return nb_heure*15;
    }
}

/**
 * Vendeur
 */
class Vendeur extends Employer{
    double chiffre_daffaire = 0;

    Vendeur(String nom, String prenom, int age, int annee_debut, int chiffre_daffaire){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.annee_debut = annee_debut;
        this.chiffre_daffaire = chiffre_daffaire;
    }

    @Override
    double calculSalaires() {
        double salaire = (chiffre_daffaire*0.20)+200;
        return salaire;
    }
}

/**
 * représentant
 */
class representant extends Employer{
    double chiffre_daffaire = 0;

    representant(String nom, String prenom, int age, int annee_debut, int chiffre_daffaire){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.annee_debut = annee_debut;
        this.chiffre_daffaire = chiffre_daffaire;
    }

    @Override
    double calculSalaires() {
        double salaire = (chiffre_daffaire*0.30)+500;
        return salaire;
    }
}