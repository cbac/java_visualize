package studsstat;
public class Personne {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrganisations = 0 ;
  private static int nbTotalParticipations = 0;
  public Personne(final String nom, final String prenom){
	this.nom = nom; this.prenom = prenom;
  }
  public Personne(final String nom, final String prenom, 
	  final int nbp, final int nbo) {
	this(nom,prenom); 
	nbParticipations = nbp;
	nbTotalParticipations += nbp; 
	nbOrganisations = nbo;
  }
  public static int getNbTotalParticipations() {
	return nbTotalParticipations;
  }
  public String toString() {
	return nom + " " + prenom + " nbp " + nbParticipations 
		+ " nbo " + nbOrganisations + " nbt " 
		+ nbTotalParticipations; 
  }
}