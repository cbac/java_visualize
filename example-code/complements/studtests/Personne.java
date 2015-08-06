package complements.studtests;
public class Personne {
    String nom, prenom;
    int nbParticipations = 0, nbOrganisations = 0;

    public Personne(final String nom, final String prenom) {
        this.nom = nom; this.prenom = prenom;
    }
    void voter(final Bulletin b) {
    }
    void consulterResultat(final AbsScrutin s) {
    }
    void seRetirerDUnScrutin(final AbsScrutin s) {
    }
}