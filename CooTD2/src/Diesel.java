
public class Diesel extends Motorisation {
    public static final int prixMotorisationDiesel = 1500;

    public Diesel(Voiture uneVoiture, float uneMasse, float uneForce) 
    {
    	super(uneVoiture, uneMasse, uneForce);
    }

    public int prix() 
    {
    	return Diesel.prixMotorisationDiesel;
    }
    
    public String toString() 
    {
    	return this.getVoiture() + super.toString() +"diesel " +Diesel.prixMotorisationDiesel;
    }
}
