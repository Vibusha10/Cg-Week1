import java.util.Scanner;
import static java.lang.System.out;
public class Program11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the month : ");
		int m = input.nextInt();
		
		out.print("Enter the day : ");
		int d = input.nextInt();
		
		out.print("Enter the year : ");
		int y = input.nextInt();
		
		float y0 = y - (14 - m) /12;
		float x = y0 + y0/4 - y0/100 + y0/400;
		float m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (int) (d + x + 31 * m0 / 12) % 7;
		
		switch (d0)
		{
			case 0:
			{
				out.print("DayOfWeek is Sunday");
				break;
			}
			case 1:
			{
				out.print("DayOfWeek is Monday");
				break;
			}
			case 2:
			{
				out.print("DayOfWeek is Tuesday");
				break;
			}
			case 3:
			{
				out.print("DayOfWeek is Wednesday");
				break;
			}
			case 4:
			{
				out.print("DayOfWeek is Thursday");
				break;
			}
			case 5:
			{
				out.print("DayOfWeek is Friday");
				break;
			}
			case 6:
			{
				out.print("DayOfWeek is Satday");
				break;
			}
			default:
			{
				out.print("Invalid input");
			}
		}
	}
}