package studs;
public class Bulletin{
  private boolean value;
  private Personne votant;
  private Scrutin scrutin;
  private Choix choix;
  public Bulletin(final Personne p, final Scrutin s, 
	  final Choix c, final boolean v) {
	votant = p;
	scrutin = s;
	value = v;
	choix = c;
	choix.addBulletin(this);
  }
  public boolean getValue() {
	return value;
  }
  public void setValue(final boolean val) {
	value = val;
  }
  public void retirerDuChoix() {
	choix.retirerBulletin(this);
  }
  @Override
  public boolean equals(Object obj) {
	if (this == obj)	return true;
	if (obj == null)	return false;
	if (!(obj instanceof Bulletin))
	  return false;
	Bulletin other = (Bulletin) obj;
	if (choix == null) {
	  if (other.choix != null)
		return false;
	} else if (!choix.equals(other.choix))
	  return false;
	if (scrutin == null) {
	  if (other.scrutin != null)
		return false;
	} else if (!scrutin.equals(other.scrutin))
	  return false;
	if (votant == null) {
	  if (other.votant != null)
		return false;
	} else if (!votant.equals(other.votant))
	  return false;
	return true;
  }
}