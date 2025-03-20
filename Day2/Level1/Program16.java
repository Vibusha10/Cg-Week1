import java.util.Scanner;
public class Program16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		for ( int i = 1 ; i <= number ; i++ )
		{
			if (i %2 == 0 )
			{
				System.out.println(i + " is even" );
			}
			else
			{
				System.out.println(i + " is odd ");
			
			}
		}					
	}
}