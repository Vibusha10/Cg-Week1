import java.util.Scanner;
import static java.lang.System.out;
public class Program11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		if ( number < 0 )
		{
			out.print("Invalid input");
			System.exit(0);
		}
		
		out.println(" The multiples are : ");
		
		for ( int i = 100 ; i > 0 ; i-- )
		{
			if ( number % i == 0)
			{
				out.println(i);
			}
		}	
	}
}