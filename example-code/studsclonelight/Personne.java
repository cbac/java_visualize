package studsclonelight;
import java.util.ArrayList;
import studs.Bulletin;
public class Personne implements Cloneable {
  private String nom, prenom;
  private int nbParticipations = 0, nbOrg = 0;
  private ArrayList<Scrutin> scrutins ;
  public Personne(String nom, String prenom){
	this.nom = nom; this.prenom = prenom; scrutins = new ArrayList<Scrutin>(); }
  public Scrutin organiserScrutin(String nom) {
	scrutins.add(new Scrutin(nom,this)); return scrutins.get(nbOrg++); }
  @Override
  public Personne clone() throws CloneNotSupportedException {
	return (Personne) super.clone(); 
  }
  public String getNom(){return nom;}
  public String getPrenom(){return prenom;}
  public ArrayList<Scrutin> getScrutins(){return scrutins;}
  public void voter(Bulletin b){ }
  public void consulterResultat(Scrutin s) { }
  public void seRetirerDUnScrutin(Scrutin s) { }
}