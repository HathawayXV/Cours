package EX06.Photo;

import java.util.ArrayList;
import java.io.File;
import java.text.BreakIterator;

public class Photo implements Comparable{
    String nom_pays = "";
    int annee = 0;
    String commentaire = "" ;
    String nom_fichier = "";
    double taille_fichier = 0;

    Photo(String nom_pays, int annee, String commentaire, String nom_fichier){
        this.nom_fichier = nom_fichier;
        this.nom_pays = nom_pays;
        this.annee = annee;
        this.commentaire = commentaire;
        this.taille_fichier = tailleFichier();
    }

    double tailleFichier(){
        File file = new File(this.nom_fichier);
        if(file.exists())
            return file.length();
        else
            return 0;
    }

    public double getTaille(){
        return taille_fichier;
    }

    public int compareTo (Object o) {
        Photo p2 = (Photo)o;
        if(taille_fichier == p2.taille_fichier)
            return 0;
        else if(taille_fichier < p2.taille_fichier)
            return -1;
        else
            return 1;
	}


    public static void main(String[] args) {
        Photo p = new Photo("France", 2021, "Wow table", "image.jpg");
        Photo p2 = new Photo("France", 2022, "pompom", "pompom.jpg");
        Photo p3 = new Photo("France", 2022, "pompom table", "pompom.jpg");
        AlbumPhoto vacance = new AlbumPhoto();
        vacance.Ajoute(p);
        vacance.Ajoute(p2);
        vacance.Ajoute(p3);
        
        vacance.trier();
        //System.out.println(p.getTaille());
        //System.out.println(p.compareTo(p2));
        vacance.Afficher();
        ArrayList<Photo> temp = vacance.rechercher("table");
        for (Photo photo : temp) {
            System.out.println(photo.commentaire);
        }



    }

}
