import java.util.Iterator;
import java.util.List;
import java.util.Vector;
class Int {
  int val;
  Int(int n) { val = n; }
  int plusPlus() { return val++; }
  int getVal() {return val; }
}
public class TestIter {
  static void display(List<Int> v) {
	Iterator<Int> e = v.iterator();
	Int s;
	while(e.hasNext()){
	  s = e.next();
	  System.out.println("    "+ s.getVal());
	}
  }
  static void incrementI(List<Int> v){
	for(Int s : v){
	  s.plusPlus();
	}
  }
  public static void main(String argv[]) {
	List<Int> n = new Vector<Int>();
	for(int i = 0; i < 10 ; i++) {
	  n.add(new Int(i));
	}
	Iterator<Int> e = n.iterator();
	Int s;
	while (e.hasNext()) {
	  s = e.next();
	  s.plusPlus();
	}
	System.out.println("Apres initialisation:");
	display(n);
	incrementI(n);
	System.out.println("Apres increment par iterateur:");
	display(n);	
  }
}