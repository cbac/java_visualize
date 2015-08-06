import studs.Personne;
public class InitPersonne {
  public static void main(final String[] args) {
	Personne j;                            // reference 
	j = new Personne("Dupont", "Julien");  // instance creation
	System.out.println(j);
  }
}
