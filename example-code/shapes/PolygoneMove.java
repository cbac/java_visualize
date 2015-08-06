package shapes;
public class PolygoneMove implements Movable {
  private Place maPlace;
  public PolygoneMove() { 
	maPlace = new Place();
  }
  public Place saPlace() {return maPlace;}
  public void avancer() {maPlace.avancer();}
  public void reculer() {maPlace.reculer();}
  public void monter() {maPlace.monter();}
  public void descendre() {maPlace.descendre();}
}