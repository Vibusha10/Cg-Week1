import java.util.Scanner;
public class Program7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month : ");
		int month = input.nextInt();
		
		System.out.print("Enter the day : ");
		int day = input.nextInt();
		
		if ( month > 3 && month < 6)
		{
			System.out.print("Its a Spring Season");
		}
		else if ((month == 3 && day >= 20) || (month==6 && day <=20))
		{
			System.out.print("Its a Spring Season");
		}
		else
		{
			System.out.print("Not a Spring Season");
		}
	}
}