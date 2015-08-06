package studsabstract;
import java.util.List;
import java.util.Vector;
public final class ScrutinPlagesHoraires extends Scrutin {
  private static int nbTotal = 0;
  private List<PlageHoraire> plages;
  public ScrutinPlagesHoraires(final String nom, final Personne organisateur) {
	super(nom, organisateur);
	nbTotal++;
	plages = new Vector<PlageHoraire>();
  }
  public int addPlage(final PlageHoraire p){
	plages.add(p);
	return plages.size();
  }
}