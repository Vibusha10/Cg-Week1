import java.util.Scanner;
public class Program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the counter for rocket launch : ");
		int counter = input.nextInt();
		
		System.out.println("Count Down : ");
		
		for ( int i = counter ; i > 0 ; i-- )
		{			
			System.out.println( i );
		}
	}
}