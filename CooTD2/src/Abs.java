
public class Abs extends Freinage
{
    private static final int prixAbs = 2000;

    public Abs(Voiture uneVoiture)
    {
    	super(uneVoiture);
    }
    
    public String toString()
    {
    	return this.getVoiture()+"+ABS "+Abs.prixAbs;
    }

    public int prix() {
        // TODO Auto-generated return
        return Abs.prixAbs;
    }

}
