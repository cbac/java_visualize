package studsstat;
public class Scrutin {
  private Personne organisateur;
  private String nomScrutin;
  public Scrutin(final String nom, final Personne organisateur) {
	nomScrutin = nom;
	this.organisateur = organisateur;
  }
}