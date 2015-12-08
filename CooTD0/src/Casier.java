
public class Casier 
{
	public Object[] list;
	
	public Casier(int n)
	{
		super();
		this.list = new Object[n];
	}
	
	public Objet libere_objet(int i)
	{
		Objet o = (Objet)list[i];
		list[i] = null;
		return o;
	}
	
	public int nbCases()
	{
		return this.list.length;
	}
	
	public void prend_objet( Objet e, int i )
	{
		list[i] = e;
	}
	
	public String toString()
	{
		String str="";
		for(int i=0; i<list.length; i++)
		{
			if(this.list[i] instanceof Objet)
				str+="0";
			else if(this.list[i] instanceof Drone)
				str+="D";
			else if (this.list[i] instanceof AutoTracteur)
				str+="A";
			else
				str+=" ";
		}
		return str;
	}
}
