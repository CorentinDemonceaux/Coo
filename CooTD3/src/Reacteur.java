
public class Reacteur 
{
    public String marque;
    public int poids;
    public int pousee;

    public String toString() 
    {
        return "La marque du r�acteur est :"+this.marque+"\n"+"Le poids du r�acteur est de :"+this.poids+"\n"+"La pouss� de ce r�acteur est de :"+this.pousee;
    }
    
    public Reacteur( String marque, int poids, int pousee) 
    {
    	super();
    	this.marque = marque;
    	this.poids = poids;
    	this.pousee = pousee;
    }

}
