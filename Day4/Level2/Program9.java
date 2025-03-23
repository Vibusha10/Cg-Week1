import java.util.Scanner;
public class Program9
{
    public static boolean isPositive(int number)
    {
        if (number >= 0)
        {
            return true;
        }
        else
        {
            return false;
        }          
    }
    
    public static void isEven(int number)
    {
        if ( number % 2 == 0)
        {
            System.out.println(number + " is even");
        }
        else
        {
            System.out.println(number + " is odd");
        }
    }

    public static int compare_a(int number1,int number2)
    {
        if (number1 > number2)
        {
            return 1;
        }
        else if(number1 == number2)
        {
            return 0;
        }
        else
        {
            return -1;
        }

    }

    public static void compare(int number1,int number2)
    {
        if ( number1 == number2 )
        {
            System.out.println("The first and last element are equal");
        }
        if (number1 > number2)
        {
            System.out.println("The first element is greater than the last element");
        }
        else
        {
            System.out.println("The first element is less than the last element");     
        }        
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for ( int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Enter the value of number " + (i + 1 ) + " : ");
            array[i] = input.nextInt();           
        }

        for( int i : array)
        {
            if (isPositive(i))
            {
                System.out.println(i + " is positive");
                isEven(i);
            }
            else
            {
                System.out.println(i + " is negative");
            }
        }

        int number1,number2;

        for (int i = 1 ; i < 5 ; i++)
        {
            System.out.println("Output : " + compare_a(array[i-1],array[i]));
        }

        compare(array[0],array[4]);
    }
}