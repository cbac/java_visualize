package exceptions;

public class NullException extends NumException {
  private static final long serialVersionUID = 1L;
  public NullException() {
	super(0,"Valeur nulle non attendue");
  }
}