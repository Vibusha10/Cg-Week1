import java.util.Scanner;
public class Program12
{
    public static int sum_re(int number)
    {
        if (number == 0)
        {
            return 0;
        }
        else
        {
            return number + sum_re(number - 1);
        }
    }

    public static int sum_f(int number)
    {
        if (number == 0)
        {
            return 0;
        }
        else
        {
            int sum =(number * (number + 1)) / 2;
            return sum;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        if (number < 0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            System.out.println("Sum using recursion : " + sum_re(number));
            System.out.println("Sum using formula : " + sum_f(number));
        }
    }
}