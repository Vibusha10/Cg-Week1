import java.util.Scanner;
public class Program10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		
		while ( true )
		{
			System.out.print("Enter a value : " );
			double value = input.nextDouble();
			if (value == 0.0)
			{
				break;
			}
			else
			{
				total += value;
			}
		}	
		
		System.out.print("Sum : " + total);
	}
}