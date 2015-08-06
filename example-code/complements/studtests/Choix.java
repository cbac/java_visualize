package complements.studtests;
import java.util.List;
import java.util.Vector;

public abstract class Choix {
    private List<Bulletin> lesBulletins;
    public Choix(){
        lesBulletins = new Vector<Bulletin>();
    }
    protected int addBulletin(Bulletin b){
        lesBulletins.add(b);
        return lesBulletins.size();
    }
}
