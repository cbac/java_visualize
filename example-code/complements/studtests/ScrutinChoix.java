package complements.studtests;

import java.util.List;
import java.util.Vector;

public class ScrutinChoix extends AbsScrutin {
    private List<Choix> choix;
    public ScrutinChoix(final String nom, final Personne organisateur) {
        super(nom, organisateur);
        choix = new Vector<Choix>();
    }
    public int addChoix(final Choix c) {
        choix.add(c);
        return choix.size();
    }
    public int getSize() {
    	return choix.size();
    }
}
