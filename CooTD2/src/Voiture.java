
public abstract class Voiture {

    private String modele;
    private float masse;	
    private int numero;
    
    public abstract int prix();
    
    
    public Voiture(Voiture v)
    {
    	this.masse=v.masse;
    	this.modele=v.modele;
    	this.numero=v.numero;
    }
    
    public Voiture(int unNumero,String unModele ,float uneMasse)
    {
    	this.numero = unNumero;
    	this.modele = unModele;
    	this.masse = uneMasse;
    }
    
    public Voiture() 
    {
		this.numero = 0;
		this.modele ="";
		this.masse = 0;
	}
    
    public int getNumero()
    {
    	return this.numero;
    }
    
    public String getModele()
    {
    	return this.modele;
    }
    
    public float getMasse()
    {
    	return this.masse;
    }
    public String toString() 
    {
        return "Le modele est : "+this.modele+"\n"
        		+ "le numero est : "+this.numero+"\n"
        		+ "le poids est de : "+this.masse+"\n"
        		+ "le prix est de "+this.prix();
    }

}
