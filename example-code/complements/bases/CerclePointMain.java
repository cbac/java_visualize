package complements.bases;

public class CerclePointMain {
	public static void main(final String[] args) {
		CerclePoint c1 = new CerclePoint(10,10,10); 
		CerclePoint c2 = new CerclePoint(20,20,20);
		System.out.println(c1.toString());
		System.out.println(c2);
		CerclePoint c3 = c1; 	
		System.out.println(c3);     
		CerclePoint c4 = new CerclePoint(c2); 
		System.out.println(c4);     
	}
}
