package EX05.Dupont;

public class Rec  extends FormeGeometrique{
	double _longueur;
	double _largeur;
	public Rec (double x,double y,double longueur,double largeur)
	{
		_x=x;
		_y=y;
		_longueur=longueur;
		_largeur=largeur;
	}

	public double perimetre()
	{
		return (_longueur*2)+(_largeur*2);
	}
	public double surface()
	{
		return _longueur*_largeur;
	}

}
