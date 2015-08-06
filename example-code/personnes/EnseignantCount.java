package personnes;
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
  public String toString(){
	return "Enseignant numero " + numens 
		+ " personne numero " + numPerson;
  }
}