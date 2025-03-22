import java.util.Scanner;
public class Program7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number :");
        int number = input.nextInt();

        int size =  number / 2;

        int[] odd_array =  new int[size];
        int[] even_array =  new int[size];

        int even_count = 0;
        int odd_count = 0;

        if (number < 0)
        {
            System.out.print(number + " is not a natural number");
        }
        else
        {
            for (int i = 0 ; i < number ; i++ )
            {
                if ( i % 2 == 0)
                {
                    even_array[even_count] = i;
                    even_count++;                                      
                }
                else
                {
                    odd_array[odd_count] = i;
                    odd_count++ ;
                }
            }
            System.out.println("Even Numbers : ");    

            for (int i = 0 ; i < even_array.length ; i++ )
            {
                System.out.println(even_array[i]);
            }

            System.out.println("Odd Numbers : ");

            for (int i = 0 ; i < odd_array.length ; i++ )
            {
                System.out.println(odd_array[i]);
            }
        } 
    }
}