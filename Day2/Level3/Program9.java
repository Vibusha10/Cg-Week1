import java.util.Scanner;
import static java.lang.System.out;
public class Program9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		int sum = 0;
		
		for ( int i = 1 ; i < number ; i++ )
		{
			if (number % i == 0)
			{
				sum += i;
			}
		}
		
		if (number < sum)
		{
			out.print(number + " is a Abundant Number");
		}
		else
		{
			out.print(number + " is not Abundant Number");
		}
	}
}