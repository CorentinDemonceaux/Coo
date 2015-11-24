
public class FreinageMagnetique extends Freinage 
{
    private static final int prixFrein = 1500;

    
    public FreinageMagnetique(Voiture uneVoiture)
    {
    	super(uneVoiture);
    }
    
    public int prix() 
    {
        return FreinageMagnetique.prixFrein+this.getVoiture().prix();
    }

    public Voiture FreinMagnetique() {
        // TODO Auto-generated return
        return null;
    }
    
    public String toString() 
    {
    	return this.getVoiture()+" + freinage magnetique "+FreinageMagnetique.prixFrein;
    }

}
