import java.util.Scanner;
import static java.lang.System.out;
public class Program6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        out.print("Enter number of persons : ");
        int number = input.nextInt();

        int[] weight = new int[number];
        int[] height = new int[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for ( int i = 0 ; i < number ; i++)
        {
            out.print("Enter weight of person" + (i+1) + " : ");
            weight[i] = input.nextInt();
            out.print("Enter height of person" + (i+1) + " : ");
            height[i] = input.nextInt();
        }
		
		for (int i = 0 ; i < number ; i++)
        {
		    bmi[i] = weight[i] / ( height[i] * height[i]);

            if (bmi[i] <= 18.4)
		    {
			    status[i] = "Underweight";
		    }
		    else if ((bmi[i] > 18.4) && (bmi[i] <= 24.9))
		    {
			    status[i] = "Normal";
	    	}
		    else if ((bmi[i] >= 25.0) && (bmi[i] <= 39.9))
		    {
			    status[i] = "Overweight";
		    }
		    else
		    {
			    status[i] = "Obese";
	    	}
	    }

        for (int i = 0 ; i < number ; i++)
        {
            out.println("Person " + (i+1));
            out.println("weight : " + weight[i]);
            out.println("Height : " + height[i]);
            out.println("BMI : " + bmi[i]);
            out.println("Weight Status : " + status[i] +"\n");
        }
	}
}