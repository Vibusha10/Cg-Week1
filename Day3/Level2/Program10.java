import java.util.Scanner;
import static java.lang.System.out;
public class Program10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        out.print("Enter the number : ");
        int number = input.nextInt();

        int count = 0;

        int temp = number;

        int digit;

        while(temp != 0)
        {
            temp /= 10;
            count += 1;
        }
        
        int[] array = new int[count];

        for( int i = 0 ; i < count ; i++)
        {
            array[i] = (int) number % 10;      
            number /= 10;     
        }

        int[] frequency = new int[10];

        for( int i = 0 ; i < count ; i++)
        {
            digit = array[i];
            frequency[digit] += 1 ;   
        }

        for( int i = 0 ; i < frequency.length ; i++)
        {
            out.println(i + "=> " + frequency[i]);
        }
    }
}