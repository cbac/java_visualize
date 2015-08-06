import java.util.Date;
public class StringExample{
  public static void main(final String argv[]) {
	String s = "\u00catre ou ne pas \u00eatre";
	int lg = s.length();
	System.out.println(s + " " + lg);
	System.out.println( "Java".substring(2,3));
	System.out.println( "Java" + "Soft");
	char[] data = { 'J', 'a', 'v', 'a' };
	String n = new String(data); System.out.println(n);
	String p = String.valueOf(Math.PI); System.out.println(p);
	String d = String.valueOf(new Date()); System.out.println(d);
  }
}