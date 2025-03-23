import java.util.Scanner;
public class NumberChecker
{
    public static int count_digits(int number)
    {
        int count = 0;

        while(number != 0)
        {
            count += 1;
            number /= 10;
        }

        return count;
    }

    public static int[] digits_array(int number,int count)
    {
        int[] array = new int[count];

        for (int i=0 ; i < count ; i++)
        {
            array[i] =(int) number % 10;
            number /= 10;
        }
        return array;
    }

    public static int Sum(int[] array)
    {
        int sum = 0;

        for(int i : array)
        {
            sum += i;
        }
        return sum;
    }

    public static int square_digits(int[] array)
    {
        int sum = 0;
        for(int i : array)
        {
            sum += (int) Math.pow(i,2);
        }
        return sum;
    }

    public static void harshad_number(int[] array,int number)
    {
        int sum = 0;
        for(int i : array)
        {
            sum += (int) Math.pow(i,2);
        }

        if (number / sum == 0)
        {
            System.out.println(number + " is a Harshad Number");
        }
        else
        {
            System.out.println(number + " is not a Harshad Number");
        }
    }

    public static int[][] frequency (int[] array)
    {
        int count = 0;
        int[] unique = new int[array.length];
        int[][] frequency = new int[array.length][2];

        for(int i = 0 ; i < array.length ; i++)
        {
            int c = 0;
            for (int j = 0; j < count; j++) {
                if (unique[j] == array[i]) {
                    c = 1;
                    frequency[j][1]++; 
                    break;
                }  
            }
            if (c == 0) {
                unique[count] = array[i];
                frequency[count][0] = array[i];
                frequency[count][1] = 1;
                count++;
            }
        } 

        return frequency;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int count = count_digits(number);
        System.out.println("The count of digits : " + count);

        int[] array = digits_array(number,count);
        System.out.println("The digits in array are : ");
        for (int i=0 ; i < count ; i++)
        {
             System.out.print(array[i] + " ");
        }

        System.out.println();

        int square = square_digits(array);
        System.out.println("Sum of Square of digits is " + square);

        harshad_number(array,number);

        int[][] freq = frequency(array);
        for(int i = 0 ; i < freq.length; i++)
        {
            System.out.println(freq[i][0] + " - " + freq[i][1]);
        }
    }
}