import java.util.Scanner;
public class Program3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int[] multiplication_table = new int[10];

        for ( int i = 1 ; i <= 10 ; i++)
        {
            multiplication_table[i-1] = number * i;
        }
    
        System.out.println("The multiplication table of the " + number + " is " );
        
        for ( int i = 1 ; i <= 10 ; i++)
        {
            System.out.println( number + " * " + i + " = " + multiplication_table[i-1] );
        }
    }
}