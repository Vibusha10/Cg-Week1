import java.util.Scanner;
public class Program5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int[] multiplication_table = new int[4];

        int multiplier = 6;

        for ( int i = 0 ; i < multiplication_table.length ; i++)
        {
            multiplication_table[i] = number * (multiplier + i);
        }
    
        System.out.println("The multiplication table of the " + number + " is " );
        
        
        for ( int i = 0 ; i < multiplication_table.length ; i++ )
        {
            System.out.println( number + " * " + (multiplier + i) + " = " + multiplication_table[i] );
        }
    }
}