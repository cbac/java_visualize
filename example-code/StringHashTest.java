public class StringHashTest {
  public static void main(String[] args) {
	String s = "a";
	for(int i = 0; i< 128; i++){
	  System.out.println(s + " " + s.hashCode());
	  s += "a";
	}
  }
}