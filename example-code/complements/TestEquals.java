package complements;
import complements.equalshash.*;
import java.util.List;
import java.util.ArrayList;
class TestEquals {
  public static int sumEven() {
	List<Integer> li = new ArrayList<Integer>();
	for (int i = 1; i < 50; i += 2)
	    li.add(i);
    int sum = 0;
    for (Integer i: li)
        if (i % 2 == 0)
            sum += i;
        return sum;
}
	public static void main(String[] args) {
		Personne mickey = new Personne("Mickey","Mouse","1459066503202");
		Personne donald = new Personne("Donald","Duc", "1459066503203");
		
		if(mickey.equals(donald)){
			System.out.println("Il y a un probleme");
		} else {
			System.out.println(mickey + " et "+ donald+" ne sont pas identiques");
		}

	}

}
