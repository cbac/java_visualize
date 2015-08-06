package complements.studtests;
import java.util.List;
import java.util.Vector;

public class Studs {
    private List<Choix> lesChoix;
    private List<AbsScrutin> lesScrutins;
    private List<Bulletin> lesBulletins;
    private List<Personne> lesParticipants;
    public Studs(){
        lesChoix = new Vector<Choix>();
        lesScrutins = new Vector<AbsScrutin>();
        lesBulletins = new Vector<Bulletin>();
        lesParticipants = new Vector<Personne>();
    }
}