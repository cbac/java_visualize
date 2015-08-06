package complements.collections;
import java.util.*;
class X1 { 
	private String a,b; 
	public X1(final String a, final String b) { 
		this.a = a; 
		this.b = b;
	} 
	@Override
	public String toString(){
		return "X a = " +a +" b = "+b;
	}
}
class X2 { 
	private String a,b; 
	public X2(final String a, final String b) { 
		this.a = a; 
		this.b = b;
	} 
	@Override
	public String toString(){
		return "X a = " +a +" b = "+b;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof X2))
			return false;
		X2 other = (X2) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
}
class X3 { 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof X3))
			return false;
		X3 other = (X3) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}
	private String a,b; 
	public X3(final String a, final String b) { 
		this.a = a; 
		this.b = b;
	} 
	@Override
	public String toString(){
		return "X a = " +a +" b = "+b;
	}
}

public class BadHashExample {
	public static void printHash(Object X){
		System.out.println("Hash de " + X.toString() +" = " + X.hashCode());
	}
	public static void main(String[] args) {
		X1 x1 = new X1("a","b"); 
		X1 y1 = new X1("a","b"); 
		Hashtable<X1,String> h1 = new Hashtable<X1,String>(); 
		h1.put(x1, "c'est x"); 
		printHash(x1); 
		h1.put(y1, "c'est y");
		printHash(y1);
		if(x1.equals(y1)){
			System.out.println("x1 et y1 sont egaux");
		}
		System.out.println("nb elements dans h1 = " + h1.size()); 
		
		X2 x2 = new X2("a","b"); 
		X2 y2 = new X2("a","b"); 
		Hashtable<X2,String> h2 = new Hashtable<X2,String>(); 
		h2.put(x2, "c'est x2"); 
		printHash(x2); 
		printHash(y2); 

		h2.put(y2, "c'est y2");
		if(x2.equals(y2)){
			System.out.println("x2 et y2 sont egaux");
		}
		System.out.println("nb elements dans h2 = " + h2.size());
		
		X3 x3 = new X3("a","b"); 
		X3 y3 = new X3("a","b"); 
		Hashtable<X3,String> h3 = new Hashtable<X3,String>(); 
		h3.put(x3, "c'est x"); 
		h3.put(y3, "c'est y");
		printHash(x3); 
		printHash(y3); 
		if(x3.equals(y3)){
			System.out.println("x et y sont egaux");
		}
		System.out.println("nb elements dans h3 = " + h3.size()); 
	} 

}
