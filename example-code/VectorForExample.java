import java.util.List;
import java.util.Vector;
public class VectorForExample{
  public static void main(String argv[]) {
	List<String> v = new Vector<String>();
	v.add("John");	v.add("Georges");
	System.out.println("Taille de la liste " + v.size());
	for(String s : v){
	  System.out.println(" "+s);
	}
  }
}