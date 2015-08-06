package complements.bases;

public class CarreMain {
	public static void main(final String[] args) {
		Carre c1 = new Carre(10,10,10); 
		Carre c2 = new Carre(20,20,20);
		System.out.println(c1.toString());
		System.out.println(c2);
		Carre c3 = c1; 	
		System.out.println(c3);     
		Carre c4 = new Carre(c2); 
		System.out.println(c4);     
	}

}
