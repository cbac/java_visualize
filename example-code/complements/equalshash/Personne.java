package complements.equalshash;
public class Personne {
    private String nom, prenom, numSecu;
    public Personne(final String n, final String p, final String ns) {
        nom = n; prenom = p; numSecu = ns;
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numSecu == null) ? 0 : numSecu.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Personne))
			return false;
		Personne other = (Personne) obj;
		if (numSecu == null) {
			if (other.numSecu != null)
				return false;
		} else if (!numSecu.equals(other.numSecu))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numSecu="
				+ numSecu + "]";
	}
    
}