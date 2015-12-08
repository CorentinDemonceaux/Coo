import java.util.Scanner;

public class Test 
{
	public static final void main(String[] args)
	{
		Casier casier = new Casier(10);
		Drone drone = new Drone(casier);
		casier.list[5] = drone;
		casier.list[2] = new Objet("fenetre",1000);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choix 1 : bouger\n"
				+ "Choix 2 : prendre\n"
				+ "Choix 3 : lacher\n"
				+ "Choix 4 : finir");
		
		while(true)
		{
			System.out.println(casier.toString());
			
			switch(scan.nextInt())
			{
			case 1: 
				drone.executerDeplacement(scan.nextInt());
				break;
			case 2:
				drone.manipulerSaisir();
				break;
			case 3:
				drone.manipulerRelacher();
				break;
			case 4:
				scan.close();
				System.exit(0);
			}
		}
		
	}
}
