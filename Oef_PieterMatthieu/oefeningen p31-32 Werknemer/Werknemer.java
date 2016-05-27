public class Werknemer implements Betaalbaar{ 

	public String voornaam;
	public String achternaam;
	public int wNr;
	protected float salaris;
	private float rszpercentage=33.0f;

	public static int aantalWerknemers;


	public Werknemer(String voornaam, String achternaam, int werknemerNummer, float salaris)
	{
		this.voornaam=voornaam;
		this.achternaam=achternaam;
		this.wNr=werknemerNummer;
		this.salaris=salaris;

		aantalWerknemers++;
	}
    
    void setRSZ(float rsz)
    {
		rszpercentage = rsz;
	}
    
	public void salarisVerhogen(int percentage)
	{
		salaris=salaris * (1+(percentage/100.0f)); 
	}
	public float getSalaris()
	{
		return salaris;
	}
    
	float getRSZ() {
		return rszpercentage;
	}
    
	
	public void betaal() 
    {
		System.out.println("Betaal " + salaris + " aan " + voornaam);
	}
}