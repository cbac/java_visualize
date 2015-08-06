import studsorg.*;
public class InitScrutin {
  public static void main(final String[] args) {
	Personne p;                            // reference 
	p = new Personne("Dupont", "Julien");  // instance creation
	Scrutin bde = p.organiserScrutin("Election bde 2010");
  }
}