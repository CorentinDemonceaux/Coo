import java.util.ArrayList;

public class Course
{
	private ArrayList <Motorisation> vehicule;
	
	public Course()
	{
		this.vehicule = new ArrayList <Motorisation>();
	}
	
	public void inscrireVoiture(Motorisation vehicule)
	{
		this.vehicule.add(vehicule);
	}
	
	public void simulerCourse(float d)
	{
		System.out.println("\n Depart");
		for(int i=0 ; i<=d ; i++)
		{
			System.out.println("Course a "+i+" secondes");
			
			for(int v=0 ; v<this.vehicule.size(); v++)
			{
				Motorisation m = this.vehicule.get(v);
				float distance = m.distanceParcourure(i);
				System.out.println(m.getModele()+" a parcouru "+distance+" km");
			}
		}
		System.out.println("Fin");
	}
}
