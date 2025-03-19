import java.util.Scanner;
public class Conversion
{
	public static void main(String[] args)
	{
		Scanner input = new  Scanner(System.in);
		System.out.print("Enter the distance in feet : ");
		float distance_in_feet = input.nextFloat();
		float distance_in_yards = distance_in_feet / 3;
		float distance_in_miles = distance_in_yards / 1760;
		System.out.print("Distance in feet is " + distance_in_feet + " while in yards is " + distance_in_yards + " and in miles is " + distance_in_miles);
		input.close();
	}
}