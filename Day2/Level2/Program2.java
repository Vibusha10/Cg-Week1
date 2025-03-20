import java.util.Scanner;
public class Program2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the salary : ");
		int salary = input.nextInt();
		
		System.out.print("Enter the years of service : ");
		int years_of_services = input.nextInt();
		
		if ( years_of_services > 5 )
		{
			float bonus = ( salary * 5 )/100;
			System.out.println("The employee gets " + bonus + " as bonus");
		}
		else
		{
			System.out.println("The employee does not receive any bonus");
		}					
	}
}