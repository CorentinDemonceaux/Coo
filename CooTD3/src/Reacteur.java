
public class Reacteur 
{
    public String marque;
    public int poids;
    public int pousee;

    public String toString() 
    {
        return "La marque du réacteur est :"+this.marque+"\n"+"Le poids du réacteur est de :"+this.poids+"\n"+"La poussé de ce réacteur est de :"+this.pousee;
    }
    
    public Reacteur( String marque, int poids, int pousee) 
    {
    	super();
    	this.marque = marque;
    	this.poids = poids;
    	this.pousee = pousee;
    }

}
