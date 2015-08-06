package complements.studtests;
import java.util.Date;

public class PlageHoraire extends Choix {
    private Date dateDebut, dateFin;
    public PlageHoraire(final Date debut, final Date fin) {
        super();
        dateDebut = debut;
        dateFin = fin;
    }
    public Date getDateDebut() {
		return dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public int addBulletin(final Bulletin b){
        return super.addBulletin(b);
    }
}
