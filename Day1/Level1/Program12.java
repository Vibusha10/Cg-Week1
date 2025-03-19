import java.util.Scanner;
public class Area
{
	public static void main(String[] args)
	{
		Scanner input = new  Scanner(System.in);
		System.out.print("Enter the base of the triangle in cm : ");
		double base = input.nextDouble();
		System.out.print("Enter the height of the triangle in cm : ");
		double height = input.nextDouble();
		double area_in_square_cm = 0.5 * base * height;
		double area_in_square_inches = area_in_square_cm * 0.155;
		System.out.print("Area of Triangle in square centimeter is " + area_in_square_cm + " and square inches is " + area_in_square_inches);
		input.close();
	}
}