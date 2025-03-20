import java.util.Scanner;
public class Program4
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		if ( number >= 0 )
		{
			int sum = ( number * (number + 1)) / 2;
			
			System.out.print("The sum of " + number + " natural numbers is " + sum );
		}
		else
		{
			System.out.print("The number " + number + " is not a natural number");
		} 
	}
}