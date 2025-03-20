import java.util.Scanner;
public class Program5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the age of the person : ");
		int age = input.nextInt();
		
		if ( age >= 18 )
		{
			System.out.print("The person's age is " + age + " and can vote.");
		}
		else
		{
			System.out.print("The person's age is " + age + " and cannot vote.");
		}	
	}
}