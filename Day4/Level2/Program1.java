import java.util.Scanner;
public class Program1
{
    public static int[] factor(int number)
    {
        int count = 0;

        for (int i = 1; i <= number ; i++)
        {
            if (number % i == 0)
            {
                count += 1;
            }
        }

        int[] array = new int[count];
        int index = 0;

        for (int i = 1; i <=number ; i++)
        {
            if (number % i == 0)
            {
                array[index] = i;
                index += 1;
            }
        }
        return array;
    }  

    public int sumOfFactors(int[] array)
    {
        int sum = 0;
        for (int i : array)
        {
            sum += i;
        }
        return sum;
    }

    public int productOfFactors(int[] array)
    {
        int product = 1;
        for (int i : array)
        {
            product *= i;
        }
        return product;
    }

    public int sumOfSquareOfFactors(int[] array)
    {
        int square = 0;
        for (int i : array)
        {
            square += (Math.pow(i,2));
        }
        return square;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        Program1 factor_op = new Program1();
        int[] array = factor_op.factor(number);

        System.out.println("Sum of Factors : " + factor_op.sumOfFactors(array));
        System.out.println("Product of Factors : " + factor_op.productOfFactors(array));
        System.out.println("Sum of square of Factors : " + factor_op.sumOfSquareOfFactors(array));
    }
}