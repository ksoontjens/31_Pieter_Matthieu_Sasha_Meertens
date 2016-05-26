//import org.kdg.personeel.*; //alle werknemer classes uit die onderliggende mappen
public class LesKlassen {

	public static void main(String args[])
	{
		//OEF 1 PAGINA 31
		Werknemer jan;
		jan = new Werknemer("Jan", "Janssens", 69, 420.0f);
		Werknemer bob = new Werknemer("Bob", "Rob", 2, 30.0f);
		Werknemer jef = new Werknemer("Jef", "Gek", 5, 10.0f);
		Werknemer mark = new Werknemer("Mark", "Marky", 666, 15.0f);

		System.out.println(jan.voornaam + " verdient " + jan.getSalaris());
		System.out.println("aantal werknemers = " + Werknemer.aantalWerknemers);


		//OEF 2 
		jan.salarisVerhogen(10);
		System.out.println(jan.voornaam + " zijn nieuwe salaris is " + jan.getSalaris());
		bob.salarisVerhogen(20);
		System.out.println(bob.voornaam + " zijn nieuwe salaris is " + bob.getSalaris());

		//OEF 3 
		PartTimeWerknemer tom = new PartTimeWerknemer("Tom", "Boy", 5, 20.5f, 24);
		PartTimeWerknemer gert = new PartTimeWerknemer("Gert", "Verhulst", 13, 15.5f, 10);

		//OEF 4
		tom.salarisVerhogen(4); //bij 10 een foutmelding
		System.out.println(tom.voornaam + ",de Parttimewerkster, krijgt nu " + gert.getSalaris());

		//OEF 5
		System.out.println(gert.voornaam + ",de Parttimewerker, heeft een RSZ van " + gert.getRSZ());

		//OEF 7
		StudentWerknemer barry = new StudentWerknemer("Barry", "Allen", 10, 16.5f, 24);
		System.out.println(barry.voornaam + ",de student, betaalt een RSZ van " + barry.getRSZ() + " en krijgt " + barry.getSalaris());

		//OEF 8
		//ruben.betaal();
		Factuur factuur1 = new Factuur(1,420.69f);
		Betaalbaar[] betDingen = new Betaalbaar[2];
		betDingen[0] = bob;
		betDingen[1] = factuur1;
		for (int i =0; i<2; i++) {
			betDingen[i].betaal();
		}

	}
}