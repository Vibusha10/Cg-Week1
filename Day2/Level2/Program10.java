import java.util.Scanner;
import static java.lang.System.out;
public class Program7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		out.print("Factors of the number :");
		
		if ( number <= 0)
		{
			out.println("Invalid input");
			System.exit(0);
		}
		
		int counter = number -  1 ;
		 
		while ( counter > 0 )
		{
			if (number % counter == 0)
			{
				out.println(counter);
				break;
			}
			counter -= 1;
		}
	}
}