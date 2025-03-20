import java.util.Scanner;
import static java.lang.System.out;
public class Program2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		
		if ( ((year % 4 == 0) && (year % 100 != 0)) || ( year % 400 == 0))
		{
			System.out.print(year + " is a leap year");
		}
		else
		{
			System.out.print(year + " is not a leap year");
		}
	}
}