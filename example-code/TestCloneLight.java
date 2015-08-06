import java.util.ArrayList;
import studsclonelight.Scrutin;
import studsclonelight.Personne;
public class TestCloneLight {
  public static void main(final String[] args) 
	  throws CloneNotSupportedException {
	Personne p = new Personne("Dupont", "Julien");
	p.organiserScrutin("Election bde");
	Personne p1 = p.clone();
	if (p1 == p) {
	  System.out.println("p == p1");
	}
	if (p.getNom() == p1.getNom()) {
	  System.out.println("p et p1 noms ==");
	}
	if (p.getPrenom() == p1.getPrenom()) {
	  System.out.println("p et p1 prenoms ==");
	}
	ArrayList<Scrutin> a1, a2;
	a1 = p.getScrutins();
	a2 = p1.getScrutins();
	if (a1 == a2) {
	  System.out.println("p et p1 scrutins ==");
	} else {
	  for(int i = 0; i < a1.size(); i++){
		if(a1.get(i) == a2.get(i)){
		  System.out.println("Scrutin de rang " + i +" ==");
		}
	  }
	}
  }
}