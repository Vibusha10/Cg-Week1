import java.util.Scanner;
public class Program10
{
    public static int[] findChocolates(int numberOfchocolates, int numberOfChildren)
    {
        int chocolates_for_each_child =(int) numberOfchocolates/numberOfChildren ;
		int remaining_chocolates = numberOfchocolates % numberOfChildren ;
        return new int[] {chocolates_for_each_child,remaining_chocolates};
    }

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of chocolates : ");
		int numberOfchocolates = input.nextInt();

		System.out.print("Enter the number of children : ");
		int numberOfChildren = input.nextInt();
        
        Program10 chocolates = new Program10();
		int[] array = chocolates.findChocolates(numberOfchocolates,numberOfChildren);
		System.out.print("\nThe number of chocolates each child gets is " + array[0] + " and the number of remaining chocolates are " + array[1]);
	}
}