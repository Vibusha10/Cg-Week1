import java.util.Scanner;
public class Program1
{
    public static int Sum(int[] array)
    {
        int sum = 0;

        for(int i : array)
        {
            sum += i;
        }
        return sum;
    }

    public static void Mean(int sum)
    {
        System.out.println("Mean : " + sum / 11);
    }

    public static void shortest(int[] array)
    {
        int short_ = array[0];

        for (int i = 1 ; i < array.length ; i++)
        {
            if (array[i] < short_)
            {
                short_ = array[i]; 
            }
        }
        System.out.println("Shortest : " + short_);
    }

    public static void tallest(int[] array)
    {
        int tall = array[0];

        for (int i = 1 ; i < array.length ; i++)
        {
            if (array[i] > tall)
            {
                tall = array[i]; 
            }
        }
        System.out.println("Tallest : " + tall);
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] array = new int[11];

        int range = 250 -150 +1;

        for(int i = 0 ; i < 11 ; i++)
        {
            array[i] = (int) (Math.random() * range) + 150;
        }

        int sum = Sum(array);

        System.out.println("Sum : " + sum);
        
        Mean(sum);
        shortest(array);
        tallest(array);
    }
}
