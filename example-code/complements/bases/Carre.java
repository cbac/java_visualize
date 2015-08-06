package complements.bases;

public class Carre {
	private double cx, cy, cote;
	public double area() { return cote * cote; }
	public Carre(final double x, final double y, final double r) {
		cx = x; cy = y; cote = r;	}
	public Carre(final double c) { cx = cy = 0; cote = c; }
	public Carre(final Carre i) { cx = i.cx; cy=i.cy; cote=i.cote; }
	public Carre() { this(0.0, 0.0, 0.0); }
	public String toString(){
		return "Carre x=" + cx + " y=" + cy + " r=" + cote;
	}
}
