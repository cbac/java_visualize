package complements.heritage;

import complements.bases.Point;

public class Cercle extends Figure{
	private double cr;
	public double area() { return Math.PI*cr*cr; }
	public Cercle(final double x, final double y, final double r) {
		super(new Point(x, y));
		cr = r;	
	}
	public Cercle(final double r) { 
		super(new Point(0,0));
		cr = r; 
	}
	public Cercle(Cercle i) {
		super(i);
		cr=i.cr; 
	}
	public Cercle() { this(0.0); }
	public String toString(){
		return "Cercle :" + super.toString() + " r=" + cr;
	}
}
