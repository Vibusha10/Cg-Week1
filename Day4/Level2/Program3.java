import java.util.Scanner;
public class Program1
{
	public static void leap_year(int year)
	{		
		if (year < 1582)
		{
			System.out.print("Year " + year + " is invalid");
		}
		else if ( (year % 4 == 0) && (year % 100 != 0))
		{
			System.out.print(year + " is a leap year");
		}
		else if (year % 400 == 0)
		{
			System.out.print(year + " is a leap year");
		}
		else
		{
			System.out.print(year + " is not a leap year");
		}
    }

    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the year : ");
		int year = input.nextInt();

        leap_year(year);
	}
}