import java.util.Scanner;
import static java.lang.System.out;
public class Program7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        out.print("Enter number of persons : ");
        int number = input.nextInt();

        double[][] person_data = new double[number][3];
        String[] weight_status = new String[number];

        for ( int i = 0 ; i < number ; i++)
        {
            out.print("Enter weight of person" + (i+1) + " : ");
            person_data[i][0] = input.nextInt();
            out.print("Enter height of person" + (i+1) + " : ");
            person_data[i][1] = input.nextInt();
        }
		
		for (int i = 0 ; i < number ; i++)
        {
		   person_data[i][2] =person_data[i][0] / ( person_data[i][1] *person_data[i][1]);

            if (person_data[i][2] <= 18.4)
		    {
			    weight_status[i] = "Underweight";
		    }
		    else if ((person_data[i][2] > 18.4) && (person_data[i][2] <= 24.9))
		    {
			    weight_status[i] = "Normal";
	    	}
		    else if ((person_data[i][2] >= 25.0) && (person_data[i][2] <= 39.9))
		    {
			    weight_status[i] = "Overweight";
		    }
		    else
		    {
			    weight_status[i] = "Obese";
	    	}
	    }

        for (int i = 0 ; i < number ; i++)
        {
            out.println("Person " + (i+1));
            out.println("weight : " + person_data[i][0]);
            out.println("Height : " + person_data[i][1]);
            out.println("BMI : " + person_data[i][2]);
            out.println("Weight Status : " + weight_status[i] +"\n");
        }
	}
}