package complements.commeenc;
public class Premier {
  private static boolean estPremier(final int nb) {
	if (nb == 1) { return false; }
	for (int i=2; i<= nb/2; i++) {
	  if (nb%i == 0) { 
		return false; 
	  }
	}
	return true;
  }
  public static void main(String[] args) {
	int nombre = Console.readInt("Entrez un nombre entier");
	System.out.println("Le nombre " + nombre + " est-il premier ?");
	System.out.print("Le nombre " + nombre);
	if (estPremier(nombre)) {
	  System.out.println(" est premier");
	} else {
	  System.out.println(" n'est pas premier");
	}
  }
}