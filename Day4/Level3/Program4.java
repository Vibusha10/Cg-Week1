import java.util.Scanner;
import java.util.Arrays;
public class NumberChecker
{
    public static int count_digits(int number)
    {
        int count = 0;

        while(number != 0)
        {
            count += 1;
            number /= 10;
        }

        return count;
    }

    public static int[] digits_array(int number,int count)
    {
        int[] array = new int[count];

        for (int i=0 ; i < count ; i++)
        {
            array[i] = number % 10;
            number /= 10;
        }

        int start = 0;
        int end  = array.length - 1;
        int temp;

        while (start < end)
        {
            temp = array[start];
            array[start] = array[end];
            array [end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int[] reversed_array(int[] array)
    {
        int[] reverse_arr = new int[array.length];
        int index = 0;

        for (int i = array.length - 1 ; i >= 0 ; i--)
        {
            reverse_arr[index] = array[i];
            index++;
        }
        return reverse_arr;
    }

    public static void Compare(int[] array,int[] rev_arr)
    {
        boolean isequal = Arrays.equals(array,rev_arr);
        if(isequal)
        {
            System.out.println("It is equal");
        }
        else
        {
            System.out.println("It is not equal");
        }
    }

    public static void Palindrome(int[] array,int[] rev_arr)
    {
        boolean isequal = Arrays.equals(array,rev_arr);
        if(isequal)
        {
            System.out.println("It is Palindrome");
        }
        else
        {
            System.out.println("It is not Palindrome");
        }
    }

    public static void duck_number(int[] array)
    {
        int c=0;
        for( int i : array)
        {
            if (i == 0)
            {
                c=1;
                break;
            }
        }
        if (c==1)
        {
            System.out.println("It is a Duck Number");
        }
        else
        {
            System.out.println("It is not a Duck Number");
        }
    }
    

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int count = count_digits(number);
        System.out.println("The count of digits : " + count);

        int[] array = digits_array(number,count);
        System.out.println("The digits in array are : ");
        for (int i=0 ; i < count ; i++)
        {
             System.out.print(array[i] + " ");
        }

        int[] rev_arr = reversed_array(array);
        System.out.println("\nThe reversed digits in array are : ");
        for (int i = 0 ; i < count ; i++)
        {
            System.out.print(rev_arr[i] + " ");
        }

        System.out.println();

        Compare(array,rev_arr);

        Palindrome(array,rev_arr);

        duck_number(array);

    }
}
