import java.util.Scanner;
public class conversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the pound value : ");
		float pound = input.nextFloat();

		double kg = pound * 2.2f;
		System.out.print("The weight of the person in pound is " + pound + " and in kg is " + kg);
	}
}