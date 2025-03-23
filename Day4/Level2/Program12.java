import java.util.Scanner;
public class Program12
{
    public int[] generate4DigitRandomArray(int size)
    {
        int[] array = new int[size];

        for (int i = 0 ; i < size ; i++)
        {
            array[i] = 1000 + (int) (Math.random() * 9000);            
        }
        return array;
    }

    public double[] findAverageMinMax(int[] numbers)
    {
        int min=numbers[0];
        int max=numbers[0];
        int sum = 0 ;
        

        for (int i = 1 ; i < numbers.length ; i++)
        {
            sum += numbers[i];
            min = Math.min(min,numbers[i]);
            max = Math.max(min,numbers[i]);
        }
        float avg = sum / numbers.length;

        return new double[] {min,max,avg};
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int size = input.nextInt();

        Program12 output = new Program12();
        int[] array = output.generate4DigitRandomArray(size);

        double[] numbers = output.findAverageMinMax(array);
        System.out.println("Minimum : " + numbers[0]);
        System.out.println("Maximum : " + numbers[1]);
        System.out.println("Average : " + numbers[2]);
    }
}