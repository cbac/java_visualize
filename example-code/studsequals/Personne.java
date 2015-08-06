package studsequals;
public class Personne {
  private String nom, prenom;
  public Personne(final String nom, final String prenom){
	this.nom = nom; this.prenom = prenom;
  }
  @Override
  public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (!(obj instanceof Personne))	return false;
	Personne other = (Personne) obj;
	if (nom == null) {
	  if (other.nom != null) return false;
	} else if (!nom.equals(other.nom)) return false;
	if (prenom == null) {
	  if (other.prenom != null)	return false;
	} else if (!prenom.equals(other.prenom)) return false;
	return true;
  }
}