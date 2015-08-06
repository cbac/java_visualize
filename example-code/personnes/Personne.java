package personnes;
public class Personne {
  private String nom, prenom, numSecu;
  public Personne(final String n, final String p, final String ns){
	nom = n; prenom = p; numSecu = ns;
  }
  public String toString(){
	return "Personne: " + nom + " " + prenom + " " + numSecu;
  }
}