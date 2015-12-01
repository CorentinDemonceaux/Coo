import java.util.ArrayList;

public class UsineJetAirbus extends UsineJet 
{
	
    public Jet fabriqueJet( String modele, String marqueReact) 
    {
    	if(modele.equals("A320"))
    	{
    		Fuselage fu = new Fuselage(120,30);
    		ArrayList<Reacteur> react = new ArrayList<Reacteur>();
    		
    		if(marqueReact.equals("RollRoyce"))
    		{
    			react.add( new RollRoyce(5,10));
    			react.add( new RollRoyce(5,10));
    		}
    		if(marqueReact.equals("Trent"))
    		{
    			react.add(new Trent(6,9));
    			react.add(new Trent(6,9));
    		}
    		Jet j = new A320(fu,react);
    		return j;
    	}
    	
    	if(modele.equals("A380"))
    	{
    		Fuselage fu = new Fuselage(550,110);
    		ArrayList<Reacteur> react = new ArrayList<Reacteur>();
    		
    		if(marqueReact.equals("RollRoyce"))
    		{
    			react.add(new RollRoyce(8,12));
    			react.add(new RollRoyce(8,12));
    			react.add(new RollRoyce(8,12));
    			react.add(new RollRoyce(8,12));
    		}
    		
    		if(marqueReact.equals("Trent"))
    		{
    			react.add(new Trent(9,13));
    			react.add(new Trent(9,13));
    			react.add(new Trent(9,13));
    			react.add(new Trent(9,13));
    		}
    		Jet j = new A380(fu,react);
    		return j;
    	}
    	return  null;
    }

	public UsineJetAirbus( String ville) 
    {
    	super("Airbus", ville);
    }

}
