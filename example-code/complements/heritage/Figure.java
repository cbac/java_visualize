package complements.heritage;

import complements.bases.Point;

public abstract class Figure {
	private Point centre;
	public abstract double area();
	public Figure(final Point p){
		centre = new Point(p);
	}
	public Figure(final Figure f){
		centre = new Point(f.centre);
	}
	public String toString(){
		return "Figure : " + centre;
	}
}
