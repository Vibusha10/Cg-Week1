import java.util.Scanner;
import static java.lang.System.out;
public class Program12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		out.print("Enter the power of the number : ");
		int power = input.nextInt();
		
		if ( number < 0 || power < 0)
		{
			out.print("Invalid input");
			System.exit(0);
		}
		
		int result = 1 ;
		
		for ( int i = 1 ; i <= power ; i++ )
		{
			result *= number;
		}	
			
		out.print("The power of the number is "  + result);
	}
}