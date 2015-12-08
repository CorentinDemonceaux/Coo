

public class Robot {
   
    public Casier casier;
    public Deplacement deplacement;
	public Manipuler manipuler;
	public int numeroCase;
	public Objet monObjet;
	

	public Robot (Casier unCasier)
	{
		super();
		this.casier = unCasier;
		this.monObjet = null;
		this.numeroCase = 0;
	}
	
    public void executerDeplacement(int numeroCaseArrivee)
	{
		System.out.println("Je suis en "+this.numeroCase);
		this.numeroCase = numeroCaseArrivee;
		this.deplacement.seDeplacer();
		System.out.println("Je suis en "+this.numeroCase); 
    }

    public void setDeplacement(Deplacement d) 
	{
		this.deplacement = d;
    }

    public void setManipuler(Manipuler m) 
	{
		this.manipuler = m;
    }

	public void manipulerSaisir() 
	{
		this.manipuler.saisir();
		System.out.println(" dans la case"+this.numeroCase);
    }
	
    public void manipulerRelacher() 
	{
		this.manipuler.relacher();
		System.out.println(" dans la case"+this.numeroCase);
    }
	
}
