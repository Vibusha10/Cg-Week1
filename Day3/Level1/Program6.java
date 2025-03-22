import java.util.Scanner;
public class Program6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] height = new double[11];

        double sum = 0;

        for (int i = 0 ; i < height.length ; i++)
        {
            System.out.print("Enter the height of football player" + (i+1) + " : ");
            height[i] = input.nextDouble();
            sum += height[i];
        }

        double mean = sum / height.length;

        System.out.printf("The mean height of football team is %.2f",mean);
    }
}