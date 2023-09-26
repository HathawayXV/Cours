package EX05.Dupont;

public class Cercle  extends FormeGeometrique{
	double _rayon;
	double _x;
	double _y;
	public Cercle (double x,double y,double rayon)
	{
		_x=x;
		_y=y;
		_rayon=rayon;
	}


	public double perimetre()
	{
		return Math.PI*2*_rayon;
	}
	public double surface()
	{
		return Math.PI*_rayon*_rayon;
	}
}
