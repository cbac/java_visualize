package complements;

import complements.equalshash.*;

public class TestToString {
	public static void main(String[] args) {
		Personne mickey = new Personne("Mickey","Mouse","1459066503202");
		Enseignant walt = new Enseignant("Donald","Duc", "1459066503203",1,"cartoon");

		System.out.println(mickey);
		System.out.println(walt);

	}
}
