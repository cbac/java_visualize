package studsabstract;
public class Personne {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrganisations = 0;

  public Personne(final String n, final String p) {
	nom = n; prenom = p;
  }
  public void voter(final Bulletin b){    }
  public void consulterResultat(final Scrutin s) {    }
  public void seRetirerDUnScrutin(final Scrutin s) {    }
}