import java.util.Scanner;
public class Program4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        double total = 0.0;
        int index = 0;

        System.out.println("Enter the element of the array : ");

        while(true)
        {
            double number = input.nextDouble();

            if ( number == 0 || number < 0 || index == 10)
            {
                break;
            }
            else
            {
                array[index] = number;
                index +=1 ;
            }
        }

        for (int i = 0 ; i < array.length ; i++ )
        {
            total += array[i];
        }

        System.out.println("The sum of elements of array is " + total);
    }
}