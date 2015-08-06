package studsthis;
import studs.Bulletin;
import studs.Scrutin;
public class Personne {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrganisations = 0;

  public Personne(final String nom, final String prenom) {
	this.nom = nom; this.prenom = prenom;
  }
  public Personne(final String n, final String p, 
	  final int nbp, final int nbo) {
	this(n, p);
	nbParticipations = nbp; nbOrganisations = nbo;
  }    
  void voter(final Bulletin b){    }
  void consulterResultat(final Scrutin s) {    }
  void seRetirerDUnScrutin(final Scrutin s) {    }
}