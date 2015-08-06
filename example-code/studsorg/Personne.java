package studsorg;
public class Personne {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrganisations = 0;
  private Scrutin[] scrutinsOrganises ;
  public Personne(final String nom, final String prenom) {
	this.nom = nom; this.prenom = prenom;
	scrutinsOrganises = new Scrutin[10];
  }
  public Scrutin organiserScrutin(final String nom){
	Scrutin s = new Scrutin(nom);
	scrutinsOrganises[nbOrganisations] = s; 
	nbOrganisations ++;
	return s;
  }
  public String toString() {
	return getClass().getName() + " "+nom+" "+prenom+" nbp "
		+ nbParticipations + " nbo " + nbOrganisations; 
  }
}