package EX06.Photo;

import java.util.ArrayList;
import java.util.Collections;

public class AlbumPhoto implements EnsemblePhoto {
    ArrayList<Photo> Album_photos = new ArrayList<Photo>();

    public void Ajoute(Photo a){
        Album_photos.add(a);
    }

    public void Afficher(){
        for (Photo photo : Album_photos) {
            System.out.println(photo.nom_fichier +" "+photo.taille_fichier);
        }
    }

    public void trier() {
        Collections.sort(Album_photos);
    }

    public ArrayList<Photo> rechercher(String a) {
        ArrayList<Photo> temp = new ArrayList<Photo>();
        for (Photo photo : Album_photos) {
            if(photo.commentaire.contains(a)) {
                temp.add(photo);
            }
        }
        return temp;
    }
}
