import java.util.Scanner;
public class swap
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int number1 = input.nextInt();
		System.out.print("Enter the second number : ");
		int number2 = input.nextInt();
		int Temporary = number1;
		number1 = number2;
		number2 = Temporary;
		System.out.print("The swapped numbers are  " + number1 + " and " + number2);
		input.close();
	}
}