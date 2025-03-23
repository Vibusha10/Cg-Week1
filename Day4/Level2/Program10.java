import java.util.Scanner;
import static java.lang.System.out;
public class Program10
{
    public static double[][] bmi_cal(double[][] array)
    {
        for (int i = 0 ; i < 10; i++)
        {
            array[i][2] =  array[i][0] / (array[i][1] * array[i][1]);
        }
        return array;
    }

    public static void status_bmi(double[][] array)
    {
         for (int i = 0 ; i < 10; i++)
        {
            if (array[i][2] <= 18.4)
            {
                System.out.println("Person" +( i+1) +" Underweight");
            }
            else if ((array[i][2] > 18.4) && (array[i][2] <= 24.9))
            {
                System.out.println("Person" +( i+1) + " Normal");
            }
            else if ((array[i][2] >= 25.0) && (array[i][2] <= 39.9))
            {
                System.out.println("Person" +( i+1) + " Overweight");
            }
            else
            {
                System.out.println("Person" +( i+1) + " Obese");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[][] bmi = new double[10][3];

        for ( int i = 0 ; i < 10 ; i++)
        {
            out.print("Enter weight of person" + (i+1) + " : ");
            bmi[i][0] = input.nextDouble();
            out.print("Enter height of person" + (i+1) + " : ");
            bmi[i][1]= input.nextDouble();
        }

        double[][] array = bmi_cal(bmi);
        status_bmi(array);
    }
}