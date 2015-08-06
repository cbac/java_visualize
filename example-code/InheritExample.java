class Personne {
  private String nom, prenom, numSecu;
  public Personne(final String n, final String p, final String ns){
	nom = n; prenom = p; numSecu = ns;
  }
  public String toString(){
	return "Personne: " + nom + " " + prenom + " " + numSecu;
  }
}
class Enseignant extends Personne {
  private int nbCours; private String specialite;
  public Enseignant(final String n, final String p, final String ns,
	  final int nbc, final String specialite) {
	super(n, p, ns); 
	nbCours = nbc;
	this.specialite = specialite;
  }
  public String toString(){
	return "Enseignant: " + nbCours + " " +specialite;
  }
}
public class InheritExample {
  public static void main(final String[] args) {
	Personne p = new Personne("Dupont","Julien", 
		"1831291...");
	Enseignant e = new Enseignant("Durand","Emilie", 
		"2780633...",3,"Cloud Computing");
	System.out.println("p est une Personne " 
		+ (p instanceof Personne)); 
	System.out.println("p est un Enseignant " 
		+ (p instanceof Enseignant)); 
	
	System.out.println("e est une Personne " 
		+ (e instanceof Personne));
	System.out.println("e est un Enseignant " 
		+ (e instanceof Enseignant)); 
  }
}
