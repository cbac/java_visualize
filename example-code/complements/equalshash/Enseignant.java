package complements.equalshash;
public class Enseignant extends Personne {
    private int nbCours; 
    private String specialite;
    public Enseignant(final String n, final String p, final String ns,
    		final int nbc, final String specialite) {
        super(n, p, ns); nbCours = nbc;
        this.specialite = specialite;
    }
	@Override
	public String toString() {
		return "Enseignant [nbCours=" + nbCours + ", specialite=" + specialite
				+ "]";
	}
    
}