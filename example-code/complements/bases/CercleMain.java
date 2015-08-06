package complements.bases;


public class CercleMain {
	public static void main(final String[] args) {
		Cercle c1 = new Cercle(10,10,10); 
		Cercle c2 = new Cercle(20,20,20);
		System.out.println(c1.toString());
		System.out.println(c2);
		Cercle c3 = c1; 	
		System.out.println(c3);     
		Cercle c4 = new Cercle(c2); 
		System.out.println(c4);     
	}
}