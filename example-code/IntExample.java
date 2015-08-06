public class IntExample{
  public static void main(final String argv[]) {
	Integer i = new Integer("4567");
	int j = i.intValue();
	i = 4567;   // boxing i = new Integer(4567);
	j = i / 2 ; // unboxing i.intValue()
	System.out.println("Integer i :" + i + " int j :" + j + "\n");
	j = Integer.parseInt("123");
	System.out.println(" j :" + j + "\n");
  }
}