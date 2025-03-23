import java.util.Scanner;
public class Program8
{
    public static int[] findSmallestAndLargest(int number1, int number2, int number3)

    {
        int small;
        int large;

        if ((number1 > number2) && (number1 > number3) )
        {
            large = number1;
        }
        else if ((number2 > number1) && (number2 > number3) )
        {
            large = number2;
        }
        else
        {
            large = number3;
        }

        if ((number1 < number2) && (number1 < number3) )
        {
            small = number1;
        }
        else if ((number2 < number1) && (number2 < number3 ))
        {
            small = number2;
        }
        else
        {
            small = number3;
        }

        return new int[] {small,large};
    }

    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second number : ");
		int number2 = input.nextInt();
		
		System.out.print("Enter the third number : ");
		int number3 = input.nextInt();
		
		System.out.println();

        Program8 smallestlargest = new Program8();
        int[] array = smallestlargest.findSmallestAndLargest(number1,number2,number3);

        System.out.println("Smallest : " + array[0]);
        System.out.println("Largest : " + array[1]);
    }

}