public class PartTimeWerknemer extends Werknemer{

	int aantalUrenGewerkt;
	public PartTimeWerknemer(String voornaam, String achternaam, int wNummer, float salaris, int aantalUren)
	{
		super(voornaam, achternaam, wNummer, salaris);
		aantalUrenGewerkt= aantalUren;
	}

	public float getWeekloon()
	{
		return aantalUrenGewerkt*salaris;
	}

	public void salarisVerhogen(float perc)
	{
		if(perc > 5)
		{
			System.out.println("Percentge hoger dan 5");
		}
		else
		{
			super.salarisVerhogen(perc);
		}
	}

}