import java.util.Scanner;
import java.util.Arrays;
public class Program4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long number = input.nextLong();

        int maxDigit = 10;

        int[] array = new int[maxDigit];

        int index = 0;


        while ((number!=0) || (index == maxDigit))
        {
            if (index == maxDigit)
            {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                Arrays.copyOf( array,maxDigit);
                array=temp;

            }
            array[index] = (int) number % 10;
            number /= 10;
            index++;
        }

        int largest = -1;
        int second_largest = -1;

        for (int i = 0 ; i < index ; i++)
        {
            if (array[i]>largest)
            {
                second_largest = largest;
                largest = array[i];
            }
            if ((array[i] != largest) && (array[i]>second_largest))
            {
                second_largest = array[i];
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("Second Largest : " + second_largest);
    }
}