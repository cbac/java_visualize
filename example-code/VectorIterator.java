import java.util.Vector;
import java.util.List;
import java.util.Iterator;
public class VectorIterator {
  public static void main(String argv[]) {
	List<String> v = new Vector<String>();
	v.add("John"); v.add("Georges");
	Iterator<String> e = v.iterator();
	while(e.hasNext()){
	  System.out.println(" " + e.next());
	}
	// Parcours avec une boucle for
	for(e = v.iterator();e.hasNext();){
	  System.out.println(" " + e.next());
	}
  }
}