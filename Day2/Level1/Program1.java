import java.util.Scanner;
public class Program1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		System.out.print("Is the number " + number + " divisible by 5? " + ( number % 5 == 0 ) );			
	}
}