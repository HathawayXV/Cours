package EX05.Dupont;

public class TestDupont{
  public static void main (String args[]) {

    // Dupont cree un rectangle
	  Rec rectangle=new Rec(0,0,4,5);
    // Dupont appelle les methodes developpees par Pasquier
    // Il est *oblige* de passer a la methode afficherStats un objet instance d'une classe implementant la classe abstraite FormeGeometrique
	  Editeur ed = new Editeur ();
	// Afficher dans la console en appelant la m�thode afficher sur cette forme
	  rectangle.Afficher();
    // Changer les coordonn�es de la forme en appelant la m�thode d�placer
	  rectangle.deplacer(1.0, 1.0);
	// Afficher dans la console en appelant la m�thode afficher sur cette forme
	  rectangle.Afficher();
     // Demander de nouveau d�afficher des statistiques sur cette forme

    // Idem avec un cercle
	  Cercle cercle=new Cercle(0,0,4);
	  cercle.Afficher();
	  cercle.deplacer(1.0, 1.0);
	  cercle.Afficher();
  }
}
