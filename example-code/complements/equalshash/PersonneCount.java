package complements.equalshash;
public class PersonneCount {
    private String nom, prenom, numSecu;
    protected int number;
    static protected int count = 0;
    public PersonneCount(final String n, final String p, final String ns){
        nom = n; prenom = p; numSecu = ns; 
        number = count++;
    }
    public String getCount(){
        return "Il y a " + count +" personnes";
    }
    @Override
    public String toString(){
        return "Personne numero " + number + " parmi " + count;
    }
}
