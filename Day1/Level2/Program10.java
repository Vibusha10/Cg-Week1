import java.util.Scanner;
public class division
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of chocolates : ");
		int numberOfchocolates = input.nextInt();
		System.out.print("Enter the number of children : ");
		int numberOfChildren = input.nextInt();

		int chocolates_for_each_child =(int) numberOfchocolates/numberOfChildren ;
		int remaining_chocolates = numberOfchocolates % numberOfChildren ;
		System.out.print("The number of chocolates each child gets is " + chocolates_for_each_child + " and the number of remaining chocolates are " + remaining_chocolates);
		input.close();
	}
}