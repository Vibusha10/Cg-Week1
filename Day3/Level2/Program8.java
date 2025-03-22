import java.util.Scanner;
import static java.lang.System.out;
public class Program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        out.print("Enter number of persons : ");
        int number = input.nextInt();

        int[] math = new int[number];
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        float[] percentage = new float[number];
        String[] grade = new String[number];

        for( int i = 0 ; i < number ; i++ )
        {
            out.print("Enter the maths mark : ");
            math[i] = input.nextInt();

            out.print("Enter the physics mark : ");
            physics[i] = input.nextInt();

            out.print("Enter the chemistry mark : ");
            chemistry[i] = input.nextInt();

            out.println();

            if ( (math[i] < 0) || (physics[i] < 0)  || (chemistry[i] < 0) )
            {
                out.println("Invalid Marks");
                i--;
            }
        }

        for( int i = 0 ; i < number ; i++ )
        {
            percentage[i] = (math[i] + physics[i] + chemistry[i])/3;

            if (percentage[i] >= 80)
            {
                grade[i] = "A";
            }
            else if (( 70 <= percentage[i] ) && (percentage[i] <=79))
            {
                grade[i] = "B";
            }
            else if (( 60 <= percentage[i] ) && (percentage[i] <=69))
            {
                grade[i] = "C";
            }
            else if ( (50 <= percentage[i]) && (percentage[i] <= 59) )
		    {
                grade[i] = "D";
            }
            else if ( ( 40 <= percentage[i] ) && (percentage[i] <=49))
            {
                grade[i] = "E";
            }
            else
            {
                grade[i] = "R";
            }
        }
        for( int i = 0 ; i < number ; i++ )
        {
            out.println("Person " + (i+1));
            out.println("Maths: " + math[i]);
            out.println("Physics : " + physics[i]);
            out.println("Chemistry: " + chemistry[i]);
            out.println("Percentage : " + percentage[i]);
            out.println("Grade : " + grade[i] +"\n");            
        }
    }
}