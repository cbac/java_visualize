package studsclone;
import java.util.ArrayList;
import studsabstract.Bulletin;
public class Personne implements Cloneable {
  private String nom, prenom; 
  private int nbParticipations = 0, nbOrg = 0;
  private ArrayList<Scrutin> scrutins;
  public Personne(final String n, final String p) {
	this.nom = n;
	this.prenom = p;
	scrutins = new ArrayList<Scrutin>();
  }
  public Scrutin organiserScrutin(final String nom) {
	Scrutin s = new Scrutin(nom,this); 
	scrutins.add(s); 
	nbOrg ++; 
	return s; 
  }
  /** le clonage est profond, il duplique les objets references. */
  @Override 
  public Personne clone() throws CloneNotSupportedException {
	Personne cl = new Personne(new String(nom), new String(prenom));
	cl.nbParticipations = nbParticipations;
	cl.nbOrg = nbOrg;
	for (Scrutin scr : scrutins ) {
	  Scrutin sclone = scr.clone();
	  sclone.setOrganisateur(cl);
	  cl.scrutins.add(sclone); 
	}
	return cl; 
  }
  public String getNom() { return nom; } 
  public String getPrenom() {return prenom; }
  public ArrayList<Scrutin> getScrutins() {return scrutins; }
  public void voter(final Bulletin b){ }
  public void consulterResultat(Scrutin s) { }
  public void seRetirerDUnScrutin(Scrutin s) { }
}