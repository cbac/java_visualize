package studs;
import java.util.List;
import java.util.Vector;
public abstract class Choix {
  private List<Bulletin> lesBulletins;
  int nbBulletinsPour, nbBulletinsContre;
  public Choix() {
	lesBulletins = new Vector<Bulletin>();
	nbBulletinsPour = 0;
	nbBulletinsContre = 0;
  }
  public int addBulletin(Bulletin b) {
	lesBulletins.add(b);
	if(b.getValue()){
	  nbBulletinsPour++ ;
	} else {
	  nbBulletinsContre++ ;
	}
	return lesBulletins.size();
  }
  public int getNbBulletinsPour() {
	return nbBulletinsPour;
  }
  public int getNbBulletinsContre(){
	return nbBulletinsContre;
  }
  public void retirerBulletin(final Bulletin retrait) {
	if(lesBulletins.remove(retrait)){
	  if(retrait.getValue()) {
		nbBulletinsPour-- ;
	  } else {
		nbBulletinsContre-- ;
	  }
	}
  }
  public void modifierBulletin(final Bulletin changed) {
	int rang = lesBulletins.indexOf(changed);
	if (rang >=0) {
	  Bulletin aChanger = lesBulletins.get(rang);
	  if (aChanger.getValue() != changed.getValue()) {
		aChanger.setValue(changed.getValue());
	  }
	  if (aChanger.getValue()) {
		nbBulletinsContre-- ;
		nbBulletinsPour++;
	  } else {
		nbBulletinsContre++ ;
		nbBulletinsPour--;
	  }
	}
  }
}