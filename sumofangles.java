import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    
	    System.out.println("Enter the 3 angles: ");
	    
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int angles = a + b + c;
		if (angles == 180)
		{
		    System.out.println("Forms a Triangle");
		}
		else
		{
		    System.out.println("Not form a Triangle");
		}
		System.out.println(angles);
		
		s.close();
	}
}
