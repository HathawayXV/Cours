package EX05.Dupont;
import java.awt.* ;
import javax.swing.* ;


public class Editeur {

    public void afficherStats (FormeGeometrique f) {

        // Declarer une reference vers une fenetre independante
        Frame frame ;

        // Creer un objet de type fenetre independante
        frame = new Frame ("Statistiques sur une forme graphique");

        // Declarer une reference vers une etiquette
        Label labelNom ;

        // Creer une etiquette avec toutes les informations sur la forme
        String classe = f.getClass().getName();

        labelNom = new Label (classe + ", x = " + f.getX() + ", y = " + f.getY() + ", Surface = " + f.surface () + ", Perimetre = " + f.perimetre ());

        // Ajouter l'etiquette dans la frame
        frame.add(labelNom);
        // Fixer la taille de la fenetre
        frame.setSize (300, 200);

        // Afficher la fenetre
        frame.setVisible (true);
    }
}

abstract class FormeGeometrique{
    double _x = 0, _y = 0;

    void deplacer(Double x, Double y){
        this._x = x;
        this._y = y;
    };

    void Afficher(){
        System.out.println("Votre X = " + _x + ", Y = " + _y);
    };

    double getX(){
        return _x;
    }

    double getY(){
        return _y;
    }

    abstract double perimetre();
    abstract double surface();
}
