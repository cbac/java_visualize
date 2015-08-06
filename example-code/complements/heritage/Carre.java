package complements.heritage;

import complements.bases.Point;

public class Carre extends Figure {
	private double cote;
	public Carre(final double x, final double y, final double r) {
		super(new Point(x, y));
		cote = r;	
	}
	public Carre(final double r) { 
		super(new Point(0,0));
		cote = r; 
	}
	public Carre(final Carre i) {
		super(i);
		cote=i.cote; 
		}
	public Carre() { this(0.0); }
	public String toString(){
		return "Carre :" + super.toString() + " cote=" + cote;
	}
	@Override
	public double area() { return cote*cote; }

}
