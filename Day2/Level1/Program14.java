import java.util.Scanner;
public class Program14
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		int factorial = 1;
				
		if ( number > 0 )
		{
			int i = 1;
			
			while ( i <= number )
			{
				factorial *= i ;
				i += 1;
			}			
			System.out.print("The factorial of the number " + number + " is " + factorial);
		}
		else if ( number == 0 )
		{
			System.out.print("The factorial of the number " + number + " is 1" );
		}
		else
		{
			System.out.print("Number " + number + " is a invalid");
		}
	}
}