package complements.commeenc;

public class Bissextile {

	private static boolean estbissextile(final int an){
		if (an%400 ==0) { return true; }
		if (an%100 == 0) { return false; }
		if (an%4 != 0) { return false; }
		return true;
	}
	public static void main(final String[] args) {
		int annee = Console.readInt("Tapez une année > 1582 :");
		System.out.println("L'année " + annee + " est-elle bissextile?");
		if (annee <1582) {
			System.out.println("Les années <1582 ne sont pas valides");
			System.exit(0);
		}
		System.out.print("L'année " + annee );
		if (estbissextile(annee)) {
			System.out.println(" est bissextile");
		} else {
			System.out.println(" n'est pas bissextile");
		}
	}

}
