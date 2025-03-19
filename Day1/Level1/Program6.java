import java.util.Scanner;
public class feeDiscount
{
	public static void main(String[] args)
	{
		int fee = 125000;
		int discountPercent = 10;
		float discount = (fee * 10) / 100;
		float discountFee = fee - discount;
		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountFee);
	}
}