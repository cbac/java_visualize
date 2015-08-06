package personnes;
public class PersonneCount {
  private String nom, prenom, numSecu;
  protected int numPerson;
  static protected int count = 0;
  public PersonneCount(final String n, final String p, final String ns){
	nom = n; prenom = p; numSecu = ns; 
	numPerson = count++;
  }

  @Override
  public String toString(){
	return "Personne numero " + numPerson + " parmi " + count;
  }
}