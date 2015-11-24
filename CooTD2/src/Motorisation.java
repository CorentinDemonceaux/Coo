
public abstract class Motorisation extends Voiture
{  
	private float masse;
    private float force;
    private Voiture v;
    
    public abstract int prix();
    
    
    public Motorisation (Voiture uneVoiture, float uneMasse, float uneForce)
    {
    	super();
    	this.v = uneVoiture;
    	this.masse = uneMasse;
    	this.force = uneForce;
    }
    
    public Voiture getVoiture()
    {
    	return v;
    }
    
    public float getMasseMoteur()
    {
    	return this.masse;
    }
    
    public float getForceMoteur()
    {
    	return this.force;
    }
    
    public float getMasse()
    {
    	return this.getMasseMoteur()+this.getVoiture().getMasse();
    }
    
    public String getModele()
    {
    	return this.getVoiture().getModele();
    }
    
    public float acceleration() 
    {
        return this.getForceMoteur() / (this.getVoiture().getMasse() + this.getMasseMoteur());
    }
    
    public float distanceParcourure(float p1) 
    {
        return 0.5f * this.acceleration()*p1*p1;
    }
    
    public String toString()
    {
    	return "moteur : poids = "+this.getMasseMoteur()+"\n"
    			+ "force = "+this.getForceMoteur();
    	
    }

}
