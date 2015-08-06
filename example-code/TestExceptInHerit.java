class NumException extends Exception {   
  private static final long serialVersionUID = 1L;
  public NumException(final double valeur, final String s) {
	super(s + " valeur : " + valeur);
  }
}

class NullException extends NumException {
  private static final long serialVersionUID = 1L;
  public NullException() {
	super(0,"Valeur nulle non attendue");
  }
}

public class TestExceptInHerit{
  /**
   * Methode verifiant qu'une valeur est positive.
   * @param val valeur a tester
   * @return valeur d'entree
   * @throws NumException si valeur negative
   * @throws NullException si valeur egale a zero.
   */
  private static double positifOuNull(final double val) 
	  throws NumException, NullException {
	if (val < 0.0) {
	  throw new NumException(val, "PositifOuNull valeur positive attendue.");
	}
	if(val == 0.0) {
	  throw new NullException();
	}
	return val;
  }
  /**
   * traitement partiel d'exception les exceptions 
   * NullException sont traitees, les exceptions NumException
   * sont traitees partiellement et relayees.
   * @param val valeur a tester
   * @throws NumException
   */
  private static void testPositifOuNull(final double val) 
	  throws NumException {
	double d=0;
	System.out.println("Dans testPositifOuNull val = "+val);
	try {
	  d = positifOuNull(val);
	  System.out.println("Pas d'exception le code continue en sequence");
	} catch (NullException m) {
	  System.out.println("Catch NullException dans testPositifOuNull " + m);
	  throw m;
	} catch (NumException m) {
	  System.out.println("Catch NumException dans testPositifOuNull "
		  + "traitement partiel et relais" + m);
	  throw m;
	}
	finally {
	  System.out.println("Dans le finally de testPositifOuNull " + d);
	}
  }
  public static void main(final String [] args) {
	int j = 0;
	for (String oneArg : args){
	  try {
		j = Integer.parseInt(oneArg);
		testPositifOuNull(j);
	  } catch (NumberFormatException nfe){
		System.out.println("Parameter " + oneArg 
			+ " should be an integer");
	  } catch(NumException n){
		System.out.println("Catch dans le main " + n);
	  }
	}
  }
}
