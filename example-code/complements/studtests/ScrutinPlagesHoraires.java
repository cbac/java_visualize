package complements.studtests;
import java.util.Vector;

public class ScrutinPlagesHoraires extends AbsScrutin {
    private Vector<PlageHoraire> plages;
    public ScrutinPlagesHoraires(final String nom, final Personne organisateur) {
        super(nom, organisateur);
        plages = new Vector<PlageHoraire>();
    }
    public int addPlage(final PlageHoraire p) {
        plages.add(p);
        return plages.size();
    }
}