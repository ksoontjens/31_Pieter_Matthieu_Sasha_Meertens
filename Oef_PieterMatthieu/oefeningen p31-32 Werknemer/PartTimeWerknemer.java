public class PartTimeWerknemer extends Werknemer{

	int urenPW;

	public PartTimeWerknemer(String voornaam, String achternaam, int werknemerNummer, float salaris, int uren)
	{
		super(voornaam, achternaam, werknemerNummer, salaris);
		urenPW = uren;
	}
    //OM TE CHECKEN OP HET VERHOGEN VAN SALARIS!
	public void salarisVerhogen(int percentage) 
	{
		if (percentage>5) 
        {
            System.out.println("MAG NIET");
		}
		else
		{
			super.salarisVerhogen(percentage);
		}

	}
}