import java.util.ArrayList;

public class UsineJetBoeing extends UsineJet 
{
    public Jet fabriqueJet( String modele, String marqueReact)
    {
    	if(modele.equals("B737"))
    	{
    		Fuselage fu = new Fuselage(110,28);
    		ArrayList<Reacteur> react = new ArrayList<Reacteur>();
    		
    		if (marqueReact.equals("RollRoyce"))
    		{
    			react.add(new RollRoyce(5,10));
    			react.add(new RollRoyce(5,10));
    		}
    		if(marqueReact.equals("Trent"))
    		{
    			react.add(new Trent(6,9));
    			react.add(new Trent(6,9));
    		}
    		Jet j = new B737(fu,react);
    		return j;
    		
    	}
    	if(modele.equals("B747"))
    	{
    		Fuselage fu = new Fuselage(375,100);
    		ArrayList<Reacteur> react = new ArrayList<Reacteur>();
    		
    		if(marqueReact.equals("RollRoyce"))
    		{
    			react.add(new RollRoyce(20,38));
    			react.add(new RollRoyce(20,38));
    			react.add(new RollRoyce(20,38));
    			react.add(new RollRoyce(20,38));
    		}
    		if(marqueReact.equals("Trent"))
    		{
    			react.add(new Trent(22,41));
    			react.add(new Trent(22,41));
    			react.add(new Trent(22,41));
    			react.add(new Trent(22,41));
    		}
    		Jet j = new B747(fu,react);
    		return j;
    	}
    	return null;
    }

    public UsineJetBoeing(String ville) 
    {
    	super("Boeing",ville);
    }

}
