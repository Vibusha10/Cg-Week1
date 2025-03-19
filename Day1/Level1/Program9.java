import java.util.Scanner;
public class feeDiscount
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the fee amount : ");
		int fee = input.nextInt();
		System.out.print("Enter the discount amount : ");
		int discountPercent = input.nextInt();
		float discount = (fee * discountPercent) / 100;
		float discountedFee = fee - discount;
		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
		input.close();
	}
}