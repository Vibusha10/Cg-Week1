import java.util.Scanner;
public class Program5
{
    public int number_checker(int number)
    {
        if (number > 0)
        {
            return 1;
        }
        else if (number < 0)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        Program5 check = new Program5();
        System.out.print("The ouput is " + check.number_checker(number));
    }
}
