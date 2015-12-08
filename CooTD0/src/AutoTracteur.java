
public class AutoTracteur extends Robot 
{
	public AutoTracteur(Casier unCasier)
	{
		super(unCasier);
		super.setDeplacement(new Rouler());
		super.setManipuler(new Pincer());
	}
}
