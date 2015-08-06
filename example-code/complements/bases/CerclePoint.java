package complements.bases;

public class CerclePoint {
	public static final double PI = 3.14159;
	private Point centre;
	private double cr;
	public double area() { return PI*cr*cr; }
	public CerclePoint(final double x, final double y, final double r) {
		centre = new Point(x, y);
		cr = r;	
	}
	public CerclePoint(final double r) { 
		centre = new Point(0,0);
		cr = r; 
	}
	public CerclePoint(final CerclePoint i) {
		centre = new Point(i.centre);
		cr=i.cr; 
		}
	public CerclePoint() { this(0.0); }
	public String toString(){
		return "CerclePoint :" + centre + " r=" + cr;
	}
}
