import java.util.Scanner;
public class Program1
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
            array[i] =(int) number % 10;
            number /= 10;
        }
        return array;
    }

    public static void duck_number(int[] array)
    {
        for (int i : array)
        {
            if (i == 0)
            {
                System.out.println(i + " is a duck number");
            }
            else
            {
                System.out.println(i + " is not a duck number");
            }
        }
    }

    public static void amstrong(int[] array,int number)
    {
        int sum = 0;
        int len = array.length;
        for(int i : array)
        {
            sum += (int) Math.pow(i,len);
        }

        if (sum == number)
        {
            System.out.println(number + " is an amstrong number");
        }
        else
        {
            System.out.println(number + " is not an amstrong number");
        }
    }

    public static int[] smallest(int[] array)
    {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for (int i : array)
        {
            if (i < small)
            {
                second_small = small;
                small = i;
            }
            else if ((i > small) && (i < second_small))
            {
                second_small = i;
            }
        }

        return new int[] {small,second_small};
    }

    public static int[] largest(int[] array)
    {
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i : array)
        {
            if (i > large)
            {
                second_large = large;
                large = i;
            }
            else if ((i > large) && (i < second_large))
            {
                second_large = i;
            }
        }

        return new int[] {large,second_large};
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

        System.out.println();

        duck_number(array);

        amstrong(array,number);

        int[] small_second_small = smallest(array);
        System.out.println("Smallest : " + small_second_small[0]);
        System.out.println("Second Smallest : " + small_second_small[1]);

        int[] large_second_large = largest(array);
        System.out.println("Largest : " + large_second_large[0]);
        System.out.println("Second Largest : " + large_second_large[1]);
    }
}