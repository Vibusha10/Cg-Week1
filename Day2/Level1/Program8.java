import java.util.Scanner;
public class Program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the counter for rocket launch : ");
		int counter = input.nextInt();
		
		System.out.println("Count Down : ");
		
		while ( counter > 0 )
		{			
			System.out.println( counter );
			counter -= 1;
		}
	}
}