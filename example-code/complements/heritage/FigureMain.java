package complements.heritage;

public class FigureMain {
	public static void main(final String[] args) {
		Figure figures[] = new Figure[10];

		figures[0] = new Cercle(10,10,10); 
		figures[1] = new Cercle(20,20,20);
		figures[2] = new Carre(10,10,10);
		figures[3] = new Carre(20,20,20);
		figures[4] = new Carre((Carre)figures[2]);
		figures[5] = new Cercle((Cercle)figures[1]);

		for (Figure f : figures) {
			System.out.println(f + " surface : "+f.area());
		}
	}
}
