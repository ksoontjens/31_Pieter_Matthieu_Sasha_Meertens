public class Faktuur implements Betaalbaar{

	public int faktuurNr;
	public int faktuurBedrag;

	public Faktuur(int fNR, int fBedrag)
	{
		faktuurNr= fNR;
		faktuurBedrag = fBedrag;
	}
	
	public void betaal()
	{
		System.out.println("Betaal faaktuur " + faktuurNr + " voor het bedrag " + faktuurBedrag);
	}

}