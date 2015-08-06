import exceptions.NumException;

public class TestSimpleExcept {
  /**
   * Positif teste si la valeur du parametre val est positive.
   * @param val valeur a tester
   * @throws NumException si val est < 0
   */
  private static void positif(final double val) throws NumException {
	if (val < 0.0) throw new NumException(val, "Valeur positive attendue.");
	return;
  }
  /**
   * testPositif utilise positif et relaye l'exception NumException.
   * @param val valeur a tester.
   * @throws NumException lorsque positif emet NumException
   */
  private static void testPositif(double val) throws NumException {
	positif(val);
	System.out.println("Pas d'exception le code continue en sequence");
	return ;
  }
  /**
   * Traitement des arguments de main par test des
   * valeurs entieres positives.
   * @param argv arguments de la ligne de commande.
   */
  public static void main(final String [] argv) {
	int i, j = 0;
	for (i=0;i<argv.length;i++) {
	  try {
		j = Integer.parseInt(argv[i]); 
		testPositif(j);
	  } catch (NumberFormatException nfe){
		System.out.println("Parameter " + argv[i] + " should be an integer");
	  } catch(NumException n){
		System.out.println("Catch dans le main " + n);
	  }
	}
  }
}