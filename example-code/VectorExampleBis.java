import java.util.Vector;
import java.util.List;
public class VectorExampleBis{
  public static void main(String argv[]) {
	List<String> v=new Vector<String>();
	v.add("un"); v.add("deux"); v.add(2, "trois");
	System.out.println("Contenu du vecteur :");
	for (int i=0; i<v.size(); i++) {
	  System.out.println("  " + v.get(i)); 
	}
	if (v.remove("un")) System.out.println("un removed");
	v.remove(0);
	System.out.println("Contenu du vecteur :");
	for (int i=0; i<v.size(); i++) {
	  System.out.println("  " + v.get(i)); 
	}
  }
}