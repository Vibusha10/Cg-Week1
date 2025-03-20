import java.util.Scanner;
import static java.lang.System.out;
public class Program5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the number : ");
		int number = input.nextInt();
		
		int sum = 0;
		
		int orginalNumber = number;
		
		while (orginalNumber !=0 )
		{
			int remainder = orginalNumber % 10;
			
			sum += Math.pow(remainder,3);
			
			orginalNumber = (int) orginalNumber/10;
		}
		
		if (sum == number)
		{
			out.print(number + " is an armstrong number");
		
		}
		else
		{
			out.print(number + " is not an armstrong number");
		}
	}
}