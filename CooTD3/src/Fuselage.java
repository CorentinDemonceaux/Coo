
public class Fuselage 
{
    private int capacite;
    private int poids;

    public String toString() 
    {    
        return "La capacit� du fuselage est de :"+this.capacite+"\n"+"Le poids du fuselage est de :"+this.poids;
    }

    public Fuselage( int capacite, int poids) 
    {
    	super();
    	this.capacite = capacite;
    	this.poids = poids;
    }

}
