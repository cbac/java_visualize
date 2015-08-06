import personnes.*;
public class ProtExample {
  public static void main(final String[] args) {
	PersonneCount p = new PersonneCount("Dupont","Julien", "1831291...");
	EnseignantCount e = new EnseignantCount("Durand","Emilie", 
		"2780633...",3,"Cloud Computing");
	System.out.println( p); 
	System.out.println(e);
  }
}