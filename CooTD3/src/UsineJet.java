
public abstract class UsineJet 
{
    private String constructeur;
    private String ville;

    public abstract Jet fabriqueJet( String modele, String marqueReact);

    public UsineJet( String ville, String nom)
    {
    	super();
    	this.constructeur = nom;
    	this.ville = ville;
    }
}
