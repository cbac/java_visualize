package studsclonedeep;
import java.util.ArrayList;

import studs.Bulletin;
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
  /** le clonage est profond, il duplique les objets references */
  @SuppressWarnings("unchecked")
  @Override 
  public Personne clone() throws CloneNotSupportedException {
	Personne clone = new Personne(new String(nom), new String(prenom));
	clone.nbParticipations = nbParticipations;
	clone.nbOrg = nbOrg;
	clone.scrutins = (ArrayList<Scrutin>) scrutins.clone();
	return clone; 
  }
  public String getNom() { return nom; } 
  public String getPrenom() {return prenom; }
  public ArrayList<Scrutin> getScrutins() {return scrutins; }
  public void voter(final Bulletin b){ }
  public void consulterResultat(Scrutin s) { }
  public void seRetirerDUnScrutin(Scrutin s) { }
}