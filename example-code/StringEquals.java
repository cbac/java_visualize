public class StringEquals{
	public static void main(final String argv[]) {
		String s = "Java", j = "Java";
		String m = "Ja";
		m += "va";
		if (s == j) { 
			System.out.println("s == j Vrai");
		} else { 
			System.out.println("s == j Faux"); 
		}
		if (j == m) { 
			System.out.println("j == m Vrai");
		} else { 
			System.out.println("j == m Faux");
		}
		if (j.equals(m)) { 
			System.out.println("j.equals(m) Vrai");
		} else {
			System.out.println("j.equals(m) Faux");
		}
	}
}
