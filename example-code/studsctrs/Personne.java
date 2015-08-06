package studsctrs;
import studs.Bulletin;
import studs.Scrutin;
public class Personne {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrganisations = 0;
  public Personne(final String n, final String p) {
	nom = n; prenom = p;
  }
  public Personne(final String n, final String p, 
	  final int nbp, final int nbo) {
	nom = n; prenom = p;
	nbParticipations = nbp; nbOrganisations = nbo;
  }
  public void voter(final Bulletin b) {    }
  public void consulterResultat(final Scrutin s) {    }
  public void seRetirerDUnScrutin(final Scrutin s) {  }
}