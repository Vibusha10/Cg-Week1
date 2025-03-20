import java.util.Scanner;
public class Program6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the age of Amar : ");
		int age1 = input.nextInt();
		
		System.out.print("Enter the age of Akbar : ");
		int age2 = input.nextInt();
		
		System.out.print("Enter the age of Anthony : ");
		int age3 = input.nextInt();
		
		System.out.print("Enter the height of Amar : ");
		int height1 = input.nextInt();
		
		System.out.print("Enter the height of Akbar : ");
		int height2 = input.nextInt();
	
		System.out.print("Enter the height of Anthony : ");
		int height3 = input.nextInt();
		
		if ( (age1 < age2 ) && (age1 < age3 ))
		{
			System.out.println("Amar is youngest");
		}
		else if (age2 < age3)
		{
			System.out.println("Akbar is youngest");
		}
		else
		{
			System.out.println("Anthony is youngest" );
		}	
		
		
		if ( (height1 > height2 ) && (height1 > height3 ))
		{
			System.out.println("Amar is tallest");
		}
		else if (height2 > height3)
		{
			System.out.println("Akbar is tallest");
		}
		else
		{
			System.out.println("Anthony is tallest" );
		}	
							
	}
}