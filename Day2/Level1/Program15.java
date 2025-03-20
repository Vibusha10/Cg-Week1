import java.util.Scanner;
public class Program15
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		int factorial = 1;
				
		if ( number > 0 )
		{			
			for ( int i = 1 ; i <= number ; i++ )
			{
				factorial *= i ;
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