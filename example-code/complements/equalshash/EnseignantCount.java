package complements.equalshash;
public class EnseignantCount extends PersonneCount {
	int nbCours, numens;
	String specialite;
	private static int count = 0;
	public EnseignantCount(final String n, final String p, final String ns,
			final int nbc, final String specialite) {
		super(n, p, ns);
		nbCours = nbc; numens = count++;
		this.specialite = specialite;
	}
	@Override
	public String getCount(){
		return "Il y a " + count + " enseignants parmi " 
				+ PersonneCount.count + " personnes"; 
	}
	@Override
	public String toString(){
		return "Enseignant num�ro " + numens 
				+ " parmi " + super.number + " personnes ";
	}
}