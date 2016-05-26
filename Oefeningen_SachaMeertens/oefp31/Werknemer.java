public class Werknemer implements Betaalbaar {

	public String voornaam;
	public String achternaam;
	public int werknemerNummer;
	protected float salaris;
	private float RSZpercentage;
	

	public Werknemer(String voornaam, String achternaam, int wNummer, float salaris)
	{
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		werknemerNummer = wNummer;
		this.salaris = salaris;
		setRSZ();
	}
	
	public void salarisVerhogen(float perc)
	{
		salaris+=(salaris*(perc/100f));
	}

	public float getSalaris()
	{
		return salaris;
	}

	public void setRSZ()
	{
		RSZpercentage = 33.0f;
	}

	public void setRSZ(float RSZ)
	{
		RSZpercentage = RSZ;	
	}

	public float getRSZ()
	{
		return RSZpercentage;
	}

	public void betaal()
	{
		System.out.println("Betaal " + salaris + " aan " + voornaam);
	}
	
}