
public class Essence extends Motorisation {
    public static final int prixMotorisationEssence = 1000;
    
  
    public Essence(Voiture uneVoiture, float uneMasse, float uneForce)
    {
    	super(uneVoiture, uneMasse, uneForce);
    }
    
    public int prix() 
    {
    	return Essence.prixMotorisationEssence;
    }

    public String toString() 
    {
    	return this.getVoiture() + super.toString()+"essence "+this.prix();
    }



}
