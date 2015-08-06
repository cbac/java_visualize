package complements.collections;
import java.util.*;

import complements.equalshash.*;

public class RemoveExamples {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		List<Personne> vPersonnes = new Vector<Personne>();
		Personne pi=null;
        for(int i = 0; i< 10; i++){
        	vPersonnes.add(new Personne("Dupont"+i, "Jules","19102271271"+i));
        }
		for(Personne p : vPersonnes){
			System.out.println(p);
		}
		Iterator<Personne> it ;
		for(it= vPersonnes.iterator();it.hasNext();pi=it.next()){
			if(pi.equals(new Personne("Dupont"+5, "Jules","19102271271"+5))){
				it.remove();
			}
		}

	}

}
