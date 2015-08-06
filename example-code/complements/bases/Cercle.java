package complements.bases;

class Cercle {
	public static final double PI = 3.14159;
	private double cx, cy, cr;
	public double area() { return PI*cr*cr; }
	public Cercle(final double x, final double y, final double r) {
		cx = x; cy = y; cr = r;	}
	public Cercle(final double r) { cx = cy = 0; cr = r; }
	public Cercle(final Cercle i) { cx = i.cx; cy=i.cy; cr=i.cr; }
	public Cercle() { this(0.0, 0.0, 0.0); }
	public String toString(){
		return "Cercle x=" + cx + " y=" + cy + " r=" + cr;
	}
}
