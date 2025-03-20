import java.util.Scanner;
import static java.lang.System.out;
public class Program7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		out.println("Factors of the number :");
		
		if ( number <= 0)
		{
			out.println("Invalid input");
			System.exit(0);
		}
		
		int i = 1 ;
		 
		while ( i < number  )
		{
			if (number % i == 0)
			{
				out.println(i);
			}
			i += 1;
		}
	}
}