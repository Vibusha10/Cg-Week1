import java.util.Scanner;
import static java.lang.System.out;
public class Program6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		int count = 0;
		
		int originalNumber = number;
		
		while ( number !=0 )
		{
			number = (int) number/10;
			count += 1;
		}
		
		out.print("The number of digits in " + originalNumber + " is " + count);
	}
}