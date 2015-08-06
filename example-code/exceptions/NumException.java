package exceptions;
public class NumException extends java.lang.Exception {   
  private static final long serialVersionUID = 1L;
  public NumException(final double valeur, final String s) {
	super(s + " valeur : " + valeur);
  }
}
