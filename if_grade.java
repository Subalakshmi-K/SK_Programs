import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int mark = sc.nextInt();
	  
	   if (mark>=90)
        {
            System.out.println("A");
        }
        else if (mark>=80)
        {
            System.out.println("B");
        }
        else if (mark>=60)
        {
            System.out.println("C");
        }
        else if (mark>=35)
        {
            System.out.println("D");
        }
        else if(mark<35)
        {
		System.out.println("Get pass mark");
        }
        sc.close();
	}
}
