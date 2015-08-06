package complements.bases;

public class CarrePointMain {
	public static void main(final String[] args) {
		CarrePoint c1 = new CarrePoint(10,10,10); 
		CarrePoint c2 = new CarrePoint(20,20,20);
		System.out.println(c1.toString());
		System.out.println(c2);
		CarrePoint c3 = c1; 	
		System.out.println(c3);     
		CarrePoint c4 = new CarrePoint(c2); 
		System.out.println(c4);     
	}
}
