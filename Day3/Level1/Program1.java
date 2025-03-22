import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] age = new int[10];

        for ( int i = 0 ; i < age.length ; i++)
        {
            System.out.print("Enter the age if student" + (i + 1) + " : ");
            age[i] = input.nextInt()
        }

        System.out.println();

        for ( int i = 0 ; i < age.length ; i++ )
        {
            if (age[i] < 0)
            {
                System.out.println("Invalid age")
            }
            if (age[i] >= 18) 
            {
                System.out.println("The student with the age " + age[i] + " can vote ");
            }
            else
            {
                System.out.println("The student with the age " + age[i] + " cannot vote ");
            }
        }
    }
}