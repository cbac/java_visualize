package complements.bases;

public class CarrePoint {
	private Point centre;
	private double cote;
	public double area() { return cote*cote; }
	public CarrePoint(final double x, final double y, final double r) {
		centre = new Point(x, y);
		cote = r;	
	}
	public CarrePoint(final double r) { 
		centre = new Point(0,0);
		cote = r; 
	}
	public CarrePoint(final CarrePoint i) {
		centre = new Point(i.centre);
		cote=i.cote; 
		}
	public CarrePoint() { this(0.0); }
	public String toString(){
		return "CarrePoint :" + centre + " cote=" + cote;
	}
}
