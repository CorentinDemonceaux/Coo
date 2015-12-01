
public class TestFabrique
{

	public static void main(String[] args)
	{
		UsineJetAirbus uAir = new UsineJetAirbus("Brest");
		System.out.println(uAir);
		
		UsineJetBoeing uBoe = new UsineJetBoeing("Moscou");
		System.out.println(uBoe);
		
		Jet j1 = uAir.fabriqueJet("A380", "Trent");
		Jet j2 = uAir.fabriqueJet("A320", "RollRoyce");
		
		System.out.println(j1);
		System.out.println("\n");
		System.out.println(j2);
		System.out.println("\n");
		
		Jet j3 = uBoe.fabriqueJet("B747", "RollRoyce");
		Jet j4 = uBoe.fabriqueJet("B737", "Trent");
		
		System.out.println(j3);
		System.out.println("\n");
		System.out.println(j4);
		
	}

}
