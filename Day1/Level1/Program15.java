import java.util.Scanner;
public class Price
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the unit price : ");
		int unitPrice = input.nextInt();
		System.out.print("Enter the quantity : ");
		int quantity = input.nextInt();
		int total_price = unitPrice * quantity;
		System.out.print("The total purchase price is INR " + total_price  + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		input.close();
	}
}