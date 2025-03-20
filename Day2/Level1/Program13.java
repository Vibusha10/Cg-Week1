import java.util.Scanner;
public class Program13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		

		int sum_using_while = 0;
		for (int i = 1 ; i <= number ; i++ )
		{
			sum_using_while += i;
		}
		System.out.println("The sum calculated using while loop : " + sum_using_while);
	
		int sum_using_formula = number * (number + 1) / 2 ;
		System.out.println("The sum calculated using formula : " + sum_using_formula);
	}
}