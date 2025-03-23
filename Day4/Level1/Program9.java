import java.util.Scanner;
public class Program9
{
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
        int quotient = (int) number/divisor;
        int remainder = (int) number % divisor;
        return new int[] {quotient,remainder};
    }

     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.print("Enter the divisor : ");
        int divisor = input.nextInt();

        Program9 output = new Program9();
        int[] array = output.findRemainderAndQuotient(number,divisor);

        System.out.println("Quotient : " + array[0]);
        System.out.println("Remainder : " + array[1]);
    }
}