import java.util.Scanner;
public class Program6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		if ( number > 0)
		{
			System.out.print("The number " + number + " is positive.");
		}
		else if ( number < 0)
		{
			System.out.print("The number " + number + " is negative.");
		}
		else
		{
			System.out.print("The number " + number + " is zero.");
		}
	}
}