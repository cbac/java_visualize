package complements.commeenc;

public class TousLesPremiers {
	private static final boolean debug = false;
	private static boolean estPremier(final int nb){
		if (nb == 1) { return false; }
		if (nb%2 == 0) { return false; }
		for (int i=3; i<= nb/i; i++) {
			if (nb%i == 0) { 
				if (debug) {
					System.out.println(i + " est un diviseur de " + nb + "\n");
				}
				return false; }
		}
		return true;
	}
	public static void main(String[] args) {
		int nombre = Console.readInt("Entrez un nombre entier");
		System.out.println("Quels sont les nombres premiers inferieurs à : " + nombre);
		for (int j=2; j<nombre; j++){
			if (estPremier(j)) {
				System.out.println("Le nombre " + j +  " est premier");
			} 
		}
	}

}
