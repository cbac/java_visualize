package complements.commeenc;

public class TriSelection {

	private static int positionDuMinimum(final int T[], final int borne) {
		int indMin=borne;
		for (int k=borne+1;k<T.length;k++) {
			if (T[k]<T[indMin]) {
				indMin = k;
			}
		}
		return indMin;
	}
	private static void triselection(final int T[]) {
		int pos,val;
		for (int i=0;i<T.length;i++) {
			pos = positionDuMinimum(T,i);
			if (pos != i) {
				val = T[pos];
				T[pos]=T[i];
				T[i]= val;
			}
		}
	}
	public static void main(final String[] args) {
		int Tab[]={9,1,3,7,6,2,8,4,5};
		System.out.println("Voici le tableau initial");
		for (int k=0; k < Tab.length; k++) {
			System.out.print(Tab[k]+ " ");
		}
		triselection(Tab);

		System.out.println("\nVoici le tableau trié");
		for (int k : Tab) {
			System.out.print(k+ " ");
		}
		System.out.println("\nFin du programme");
	}


}
