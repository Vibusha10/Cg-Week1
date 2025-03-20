import java.util.Scanner;
import static java.lang.System.out;
public class Program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		int sum = 0;
		
		int originalNumber = number;
		
		while ( originalNumber != 0 )
		{
			int unit_digit = originalNumber%10;
			
			sum += unit_digit;
			
			originalNumber = (int)originalNumber/10;
		}
		
		if (number % sum == 0)
		{
			out.print(number + " is a Harshad Number");
		}
		else
		{
			out.print(number + " is not Harshad Number");
		}
	}
}