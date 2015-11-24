
public class Test 
{
	public static void main(String[] args)
	{
		Voiture v1 = new Ferrari(123, "xX-Swag-Xx", 2);
		Voiture v2 = new Porsche(789, "Dark-FAFA", 20);
		
		Motorisation m1 = new Essence(v1, 1, 8);
		Motorisation m2 = new Diesel(v2, 5, 9);
		
		System.out.println(v1);
		System.out.println(v2);
		
		Course c = new Course();
		
		c.inscrireVoiture(m1);
		c.inscrireVoiture(m2);
		
		c.simulerCourse(2);
	}
}
