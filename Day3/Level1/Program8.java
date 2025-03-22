import java.util.Scanner;
import java.util.Arrays;
public class Program8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxFactor = 10;
        int[] factor = new int[maxFactor];

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int index = 0;

        for (int i = 1; i <= number; i++)
        { 
            if (number % i == 0) {
                factor[index] = i;
                index += 1;
            }
            if (index == maxFactor) {
                maxFactor += maxFactor;
                factor = Arrays.copyOf(factor, maxFactor);
            }
        }

        System.out.println("The factors are:");

        for (int i = 0; i < index; i++) 
        { 
            System.out.println(factor[i]);
        }
    }
}
