import java.util.List;
import java.util.Vector;
public class VectorListExample{
  public static void main(String argv[]) {
	String nom = "John";
	List<String> v = new Vector<String>();
	for (int i=0;i<5;i++) {
	  v.add(nom);
	}

	for (String s : v) {
	  System.out.println("s : " + s);
	}
  }
}