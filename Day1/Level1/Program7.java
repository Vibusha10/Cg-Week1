import java.util.Scanner;
public class earth
{
	public static void main(String[] args)
	{
		int radius = 6378;
		double volume_in_cubic_kilometer = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
		double volume_in_cubic_miles = volume_in_cubic_kilometer * 0.239913;
		System.out.print("The volume of earth in cubic kilometers is " + volume_in_cubic_kilometer + " and cubic miles is " + volume_in_cubic_miles);
	}
}