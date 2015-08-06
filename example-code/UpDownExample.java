import personnes.Personne;
import personnes.Enseignant;
public class UpDownExample {
  public static void main(final String[] args) {
	Personne p;
	Enseignant e = new Enseignant("Durand","Emilie", 
		"2780633...",3,"Cloud Computing");
	p = e;      // UpCast
	System.out.println("Apres p = e; p est une Personne " 
		+ (p instanceof Personne)
		+ "; p est un Enseignant " 
		+ (p instanceof Enseignant)); 
	e = (Enseignant) p; // Downcast
	System.out.println("Apres e = p; e est une Personne " 
		+ (e instanceof Personne)
		+ "; e est un Enseignant " 
		+ (e instanceof Enseignant));    
  }
}