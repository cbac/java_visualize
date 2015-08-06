package studsctrs;
public class Scrutin{
  private Personne organisateur;
  private String nomScrutin;
  public Scrutin(String nom, Personne organisateur){
	nomScrutin = nom;
	this.organisateur = organisateur;
  }
}