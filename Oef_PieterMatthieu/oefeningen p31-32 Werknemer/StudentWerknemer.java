public class StudentWerknemer extends PartTimeWerknemer {

	public StudentWerknemer( String voornaam, String achternaam, int nummer, float salaris, int uren)
	{
		super(voornaam, achternaam, nummer, salaris,uren);
		this.setRSZ(5.0f);
	}
}