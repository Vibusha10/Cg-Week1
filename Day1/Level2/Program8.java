import java.util.Scanner;
public class division
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter from City : ");
		String fromCity = input.nextLine();
		System.out.print("Enter via City : ");
		String viaCity = input.nextLine();
		System.out.print("Enter to City : ");
		String toCity= input.nextLine();

		System.out.print("Enter the distance between from City  and via city : ");
		int toVia = input.nextInt();
		System.out.print("Enter the distance between via City  and to city : ");
		int viaToFinalCity = input.nextInt();

		System.out.print("Enter the time taken to travel : ");
		int timeTaken = input.nextInt();

		int totalDistance = toVia + viaToFinalCity;
		float averageSpeed = totalDistance / timeTaken;

		System.out.print(totalDistance + "distance was travelled at the speed of " + averageSpeed);
		input.close();
	}
}