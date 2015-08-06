package studsabstract;
import studs.Personne;
import studs.Bulletin;
public class Studs {
  private Choix[] lesChoix;
  private Scrutin[] lesScrutins;
  private Bulletin[] lesBulletins;
  private Personne[] lesParticipants;
  public Studs() {
	lesChoix = new Choix[100];
	lesScrutins = new Scrutin[100];
	lesBulletins = new Bulletin[100];
	lesParticipants = new Personne[100];
  }
}