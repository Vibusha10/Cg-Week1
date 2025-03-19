import java.util.Scanner;
public class division
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first side : ");
		int side1 = input.nextInt();
		System.out.print("Enter the second side : ");
		int side2 = input.nextInt();
		System.out.print("Enter the third side : ");	
		int side3 = input.nextInt();

		double total_distance_in_km = side1 + side2 + side3 ;		
		double no_of_rounds = 5000 / total_distance_in_km;
		System.out.print("The total number of rounds the athlete will run is " + no_of_rounds + " to complete 5 km");
		input.close();
	}
}