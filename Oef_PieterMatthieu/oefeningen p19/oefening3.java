import java.lang.*;

public class oefening3 {
	
	
	public static void main(String args[])
	{
		float pi = 0;
		for (int i=1; i<20002; i+=4) {
			pi = pi + (1 / i);	
		}
        
		for (int j=3; i<20004; j+=4) {
			pi = pi - (1 / j);	
		}
		
	pi = pi * 4;

	System.out.println(pi);
	}
	

}