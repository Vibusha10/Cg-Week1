import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for ( int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Enter the value of number " + (i + 1 ) + " : ");
            array[i] = input.nextInt();
        }

        for (int i : array)
        {
            if (i > 0) 
            {
                System.out.println(i + " is positive");

                if ( i % 2 == 0)
                {
                    System.out.println(i + " is even");
                }
                else
                {
                    System.out.println(i + " is odd");
                }
            }
            else if ( i < 0)
            {
                System.out.println(i + " is negative");
            }
            else
            {
                System.out.println(i + " is zero");
            }  
        }

        if ( array[0] == array[1] )
        {
            System.out.println("The first and last element are equal");
        }
        if (array[0] > array[1])
        {
            System.out.println("The first element is greater than the last element"); 
        }
        else
        {
            System.out.println("The first element is less than the last element");           
        }
    }
}