public class TestAssert{
  // Utilisation de assert dans une classe
  static double testPos(final double val) throws AssertionError {
	assert(val > 0.0);
	return val;
  }
  public static void main(final String [] argv) {
	testPos(10.0);
	testPos(0.0);
	testPos(-10.0);
  }
}