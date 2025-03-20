import java.util.Scanner;
import static java.lang.System.out;
public class Program4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		boolean isPrime = true;
		
		for ( int i = 2 ; i < number ; i++)
		{
			if ( number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if (isPrime)
		{
			System.out.print(number + " is prime");
		}
		else
		{
			System.out.print(number + " is not prime");
		}
	}
}