import java.lang.*;

public class oefening1 {
	
	int tafels[] = {1, 2, 3, 4, 5, 6, 7 ,8 ,9 };
    
	int lengteTafels = tafels.length;

	public static void main(String args[])
	{
		for (int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
	

}