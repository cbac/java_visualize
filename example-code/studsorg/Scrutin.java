package studsorg;
public class Scrutin{
  private String nomScrutin;
  public Scrutin(final String nom) {
	nomScrutin = nom;
  }
  /* @see java.lang.Object#toString()   */
  @Override
  public String toString() {
	return "Scrutin [nomScrutin=" + nomScrutin + "]";
  }
  
}