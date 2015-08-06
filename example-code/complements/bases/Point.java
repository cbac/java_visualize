package complements.bases;

public class Point {
	private double cx, cy;
	public Point(final double x, final double y) {
		cx = x; cy = y; }
	public Point(final Point p) {
		cx = p.cx; cy = p.cy; }
	public String toString(){
		return "Point x=" + cx + " y=" + cy ;
	}
}
