package studsclonelight;
public class Scrutin implements Cloneable {
  private Personne organisateur;
  private String nomScrutin;
  public Scrutin(final String nom, final Personne organisateur) {
	nomScrutin = nom; 
	this.organisateur = organisateur;
  }
  /** le clonage est leger, il duplique les references seulement. */
  @Override
  public Scrutin clone() throws CloneNotSupportedException {
	Scrutin cl = (Scrutin) super.clone(); 
	return cl;
  }
  /** Methode pour modifier l'organisateur en cas de clonage. */
  void setOrganisateur(final Personne norg) {
	organisateur = norg;
  }
  public Personne getOrganisateur() {
	return organisateur;
  }
}