package studs;
import java.util.Date;
public class PlageHoraire extends Choix {
  private Date dateDebut, dateFin;
  public PlageHoraire(final Date debut, final Date fin) {
	super();
	dateDebut = debut;
	dateFin = fin;
  }
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
	  return true;
	if (obj == null)
	  return false;
	if (!(obj instanceof PlageHoraire))
	  return false;
	PlageHoraire other = (PlageHoraire) obj;
	if (dateDebut == null) {
	  if (other.dateDebut != null)
		return false;
	} else if (!dateDebut.equals(other.dateDebut))
	  return false;
	if (dateFin == null) {
	  if (other.dateFin != null)
		return false;
	} else if (!dateFin.equals(other.dateFin))
	  return false;
	return true;
  }

}
