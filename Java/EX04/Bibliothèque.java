package EX04;

import java.util.ArrayList;

/**
 * Bibliothèque
 */
public class Bibliothèque {
    ArrayList<document> doc = new ArrayList<document>();

    public static void main(String[] args) {
        System.out.println("Bibliothèque");
    }
}

class document {
    int Numero = 0;
    String  Nom = "";
}

/**
 * livre extends document
 */
class livre extends document {
    String auteur = "";
    int nbPage = 0;
}

/**
 * romans extends document
 */
class romans extends document {
    byte prix = 0;
    final int GONCOURT = 1;
    final int MEDICIS = 2;
    final int INTERALLIE = 3;
}

/**
 * manuel extends document
 */
class manuel extends document {
    int niveau_scolaire = 0;
}

/**
 * revue extends document
 */
class revue extends document {
    int mois = 0;
    int annee = 0;
}

/**
 * dictionnaire extends document
 */
class dictionnaire extends document {
    String langue_anglais = "Anglais";
    String langue_francais = "Français";
    String langue_italienne = "Italien";
    String langue_portugais = "Portugais";
    String langue_slovenien = "Slovenien";
    String langue_spagnol = "Espagnol";
}