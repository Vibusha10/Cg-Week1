import java.util.Scanner;
import static java.lang.System.out;
public class Program13
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
		
		int i = 1;
		
		while (  i < 100 ) 
		{
			if ( i % number == 0)
			{
				out.println(i);
			}
			i += 1;
		}
		
	}
}