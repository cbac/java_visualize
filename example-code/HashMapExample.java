import java.util.Hashtable;
import java.util.Map;
public class HashMapExample{
  public static void main(final String argv[]) {
	Map<String, String> ht = new Hashtable<String,String>();
	ht.put("Ba", "Bah"); ht.put("Aa", "aha");
	ht.put("BB", "bebe"); 
	for (String k : ht.keySet()) {
	  System.out.println("Cle : "+ k 
		  + " Valeur : " + ht.get(k));
	}
	for (String v : ht.values()) {
	  System.out.println(" Valeur : " + v);
	}
  }
}