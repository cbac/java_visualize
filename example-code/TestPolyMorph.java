import personnes.Personne;
import personnes.Enseignant;
public class TestPolyMorph {
  public static void main(final String[] args) {
	Personne p = new Personne("Dupont","Julien", 
		"1831291...");
	Enseignant e = new Enseignant("Durand","Emilie", 
		"2780633...",3,"Cloud Computing");
	System.out.println(p.toString()); 
	System.out.println(e.toString()); 
	p = e;      // UpCast
	System.out.println(p.toString());  
  }
}