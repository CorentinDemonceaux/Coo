
public class Objet 
{
	String nom;
	int poids;
	
	public Objet(String unNom, int unPoids)
	{
		super();
		this.nom=unNom;
		this.poids=unPoids;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getPoids()
	{
		return this.poids;
	}
	
	public String toString()
	{
		return ("Je suis un "+this.getNom()+" et je pèse"+this.getPoids());
	}
}
