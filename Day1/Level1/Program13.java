import java.util.Scanner;
public class Area
{
	public static void main(String[] args)
	{
		Scanner input = new  Scanner(System.in);
		System.out.print("Enter the perimeter of square : ");
		float perimeter = input.nextFloat();
		float side_of_square = perimeter / 4;
		System.out.print("The length of the side is " + side_of_square + " whose perimeter is " + perimeter);
		input.close();
	}
}