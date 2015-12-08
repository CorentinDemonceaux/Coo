
public class Drone extends Robot 
{
	public Drone(Casier unCasier)
	{
		super(unCasier);
		super.setDeplacement(new Voler());
		super.setManipuler(new Magnetiser());
	}
}
