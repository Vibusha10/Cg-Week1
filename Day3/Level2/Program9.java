import java.util.Scanner;
import static java.lang.System.out;
public class Program8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        out.print("Enter number of persons : ");
        int number = input.nextInt();

        int[][] marks = new int[number][3];
        float[] percentage = new float[number];
        String[] grade = new String[number];

        for( int i = 0 ; i < number ; i++ )
        {
            out.print("Enter the maths mark : ");
            marks[i][0] = input.nextInt();

            out.print("Enter the physics mark : ");
            marks[i][1] = input.nextInt();

            out.print("Enter the chemistry mark : ");
            marks[i][2] = input.nextInt();

            out.println();

            if ( (marks[i][0] < 0) || (marks[i][1] < 0)  || (marks[i][2] < 0) )
            {
                out.println("Invalid Marks");
                i--;
            }
        }

        for( int i = 0 ; i < number ; i++ )
        {
            percentage[i] = (marks[i][0] + marks[i][1]+ marks[i][2] )/3;

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
            out.println("Maths: " + marks[i][0]);
            out.println("Physics : " + marks[i][1]);
            out.println("Chemistry: " + marks[i][2]);
            out.println("Percentage : " + percentage[i]);
            out.println("Grade : " + grade[i] +"\n");            
        }
    }
}