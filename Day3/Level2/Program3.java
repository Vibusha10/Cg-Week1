import java.util.Scanner;
public class Program3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int maxDigit = 10;

        int[] array = new int[maxDigit];

        int index = 0;

        while ((number!=0) || (index == maxDigit))
        {
            array[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = -1;
        int second_largest = -1;

        for (int i = 0 ; i < index ; i++)
        {
            if (array[i]>largest)
            {
                largest = array[i];
            }
            if ((array[i] < largest) && (array[i]>second_largest))
            {
                second_largest = array[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + second_largest);
    }
}