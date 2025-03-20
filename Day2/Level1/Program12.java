import java.util.Scanner;
public class Program12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		int i = 0 ;
		int sum_using_while = 0;
		while ( i <= number )
		{
			sum_using_while += i;
			i += 1;
		}
		System.out.println("The sum calculated using while loop : " + sum_using_while);
		
		int sum_using_formula = number * (number + 1) / 2 ;
		System.out.println("The sum calculated using formula : " + sum_using_formula);
	}
}