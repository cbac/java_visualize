package complements.studtests;
import java.util.List;
import java.util.Vector;

public class Bulletin{
	Personne p;
	AbsScrutin s;
	List<AbsChoix> lesChoix;
	public Bulletin(Personne votant, AbsScrutin scrutin){
		p = votant;
		s = scrutin;
		lesChoix = new Vector<AbsChoix>();
	}
	@SuppressWarnings("unchecked")
	public List<AbsChoix> getChoix(){
		Vector<AbsChoix> toClone = (Vector<AbsChoix>) lesChoix;
		Vector<AbsChoix> cloned = (Vector<AbsChoix>) toClone.clone();
		return  cloned;
	}
	
}