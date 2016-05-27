public class Faktuur implements Betaalbaar{
    
	public int faktuurNr;
	public float faktuurBedrag;
	
	public Faktuur(int faktuurNr, float faktuurBedrag)
    {
		this.faktuurNr = faktuurNr;
		this.faktuurBedrag = faktuurBedrag;
	}
	
	public void betaal(){
		System.out.println("Betaal: " + faktuurNr + " , voor: " + faktuurBedrag);
	}
}