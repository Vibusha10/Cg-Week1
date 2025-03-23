import java.util.Scanner;
public class Program7
{
    public void sum(int number)
    {
        int sum = 0;
        for (int i = 1; i <= number ; i++ )
        {
            sum += i ;
        }
        
        System.out.print("The sum of " + number + " is " + sum);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        Program7 sumofnumbers = new Program7();
        sumofnumbers.sum(number);
    }
}