import java.util.ArrayList;
import java.util.List;

public class Jet 
{
    public String marque;
    public String modele;
    public Fuselage fuselage;
    public List<Reacteur> reacteur = new ArrayList<Reacteur> ();

    public String toString() 
    {       
        return "La marque est :"+this.marque+"\n"+"Le modele est :"+this.modele+"\n"+this.fuselage;
    }

    public Jet( String marque, String modele, Fuselage fuselage, ArrayList<Reacteur> react)
    {
    	super();
    	this.marque = marque;
    	this.modele = modele;
    	this.fuselage = fuselage;
    	this.reacteur = react;
    }

}
