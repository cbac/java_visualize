package studsabstract;
public abstract class Choix {
  private Bulletin[] lesBulletins;
  int nbBulletinsPour, nbBulletinsContre, indexBulletins;
  public Choix() {
	lesBulletins = new Bulletin[100];
	indexBulletins = 0;
	nbBulletinsPour = 0;
	nbBulletinsContre = 0;
  }
  public int addBulletin(Bulletin b) {
	lesBulletins[indexBulletins++] = b;
	if(b.getValue()){
	  nbBulletinsPour++ ;
	} else {
	  nbBulletinsContre++ ;
	}
	return indexBulletins;
  }
  public int getNbBulletinsPour() {
	return nbBulletinsPour;
  }
  public int getNbBulletinsContre(){
	return nbBulletinsContre;
  }
  public int chercherRang(Bulletin b){
	for(int i = 0; i < indexBulletins; i++){
	  if(b.equals(lesBulletins[i]))return i;
	}
	return -1;
  }
  public void retirerBulletin(final Bulletin retrait) {
	int rang = chercherRang(retrait);
	if(rang > -1){
	  compacterBulletins(rang);
	}
  }
  public void compacterBulletins(int r){
	for(int i = r; i < indexBulletins; i++){
	  lesBulletins[i] = lesBulletins[i+1];
	}
	indexBulletins --;
  }
  public void modifierBulletin(final Bulletin changed) {
	int rang = chercherRang(changed);
	if (rang >=0) {
	  Bulletin aChanger = lesBulletins[rang];
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