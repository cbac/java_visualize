import studsctrs.Personne;
public class GCExample {
  public static void main(String[] args) {
	Personne c1 = null;      
	Personne c2 = new Personne("vide", "vide"); 
	System.out.println(c2);
	c1 = c2;   // c1 duplicates last c2
	c2 = null; // c2 not valid c1 references object
	c1 = null; // c1 forgets reference to object 
	System.gc();
  }
}