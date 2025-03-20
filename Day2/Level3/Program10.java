import java.util.Scanner;
import static java.lang.System.out;
public class Program10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the count : ");
		int count = input.nextInt();
		
		out.print("Enter the first number : ");
		double number1 = input.nextDouble();
		
		out.print("Enter the second number : ");
		double number2 = input.nextDouble();
		
		double result;
		
		for (int i = 1 ; i <= count ; i++)
		{
			out.print("\nEnter the operation to be performed : ");
			char op = input.next().charAt(0);
			
			switch (op)
			{
				case '+':
				{
					result = number1 + number2;
					out.print("Value after addition is " + result);
					break;
				}
				case '-':
				{
					result = number1 - number2;
					out.print("Value after subtraction is " + result);
					break;
				}
				case '*':
				{
					result = number1 * number2;
					out.print("Value after multiplication is " + result);
					break;
				}
				case '/':
				{
					result = number1 / number2;
					out.print("Value after division is " + result);
					break;
				}
				default:
				{
					out.print("Invalid Operator");
					break;
				}
			}
		}
	}
}