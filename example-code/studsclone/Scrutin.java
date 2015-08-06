package studsclone;
public class Scrutin implements Cloneable {
  private Personne organisateur;
  private String nomScrutin;
  public Scrutin(final String nom, final Personne organisateur) {
	nomScrutin = nom; 
	this.organisateur = organisateur;
  }
  /** le clonage duplique le nom mais ne peut pas modifier l'organisateur. */
  @Override
  public Scrutin clone() throws CloneNotSupportedException {
	return new Scrutin(new String(nomScrutin), organisateur); 
  }
  /** Methode pour modifier l'organisateur en cas de clonage. */
  void setOrganisateur(final Personne norg) {
	organisateur = norg;
  }
  public Personne getOrganisateur() {
	return organisateur;
  }
}