import studsstat.Personne;
public class TestStaticPersonne {
  public static void main(final String[] args) {
	Personne j = new Personne("Dupont","Julien",7,3);
	Personne m = new Personne("Martin","Marie",5,1);
	System.out.println(j);
	System.out.println(m);
  }
}