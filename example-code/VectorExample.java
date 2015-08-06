import java.util.Vector;
public class VectorExample{
  public static void main(String argv[]) {
	Vector<String> v = new Vector<String>();
	v.addElement("John");
	v.addElement("Georges");
	for(int i=0;i<v.size();i++){
	  System.out.println("string at: "+i
		  +" is: " + v.elementAt(i));
	}
  }
}