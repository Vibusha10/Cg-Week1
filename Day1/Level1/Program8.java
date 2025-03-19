import java.util.Scanner;
public class conversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in kilometer : ");
		double kilometer = input.nextDouble();
		double kilometer_to_miles = kilometer / 1.6;
		System.out.print("The total miles is " + kilometer_to_miles + " mile for the given " + kilometer + " km");
		input.close();
	}
}