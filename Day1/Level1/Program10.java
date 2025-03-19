import java.util.Scanner;
public class conversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height in cm : ");
		double height_in_cm = input.nextDouble();
		double height_in_inches = height_in_cm / 2.54;
		double height_in_feet = height_in_inches / 12;
		System.out.print("Your Height in cm is "+ height_in_cm + " while in feet is " + height_in_feet + " and inches is " + height_in_inches);
		input.close();
	}
}