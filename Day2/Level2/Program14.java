import java.util.Scanner;
import static java.lang.System.out;
public class Program14
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
		int i = 1; 
		while ( i <= power )
		{
			result *= number;
			i += 1;
		}	
			
		out.print("The power of the number is "  + result);
	}
}