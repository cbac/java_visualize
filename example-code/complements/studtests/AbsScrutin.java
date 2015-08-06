package complements.studtests;
import java.util.List;
import java.util.Vector;

public abstract class AbsScrutin {
    private Personne organisateur;
    private String nomScrutin;
    private List<AbsChoix> possibles;
    public AbsScrutin(final String nom, final Personne organisateur){
        nomScrutin = nom;
        this.organisateur = organisateur;
        possibles = new Vector<AbsChoix>();
    }
	public Personne getOrganisateur() {
		return organisateur;
	}
	public String getNomScrutin() {
		return nomScrutin;
	}
}