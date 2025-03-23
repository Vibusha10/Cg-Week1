import java.util.Scanner;
public class Program7
{
    public boolean canStudentVote(int age)
    {
        if (age >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Program7 output = new Program7();

        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.print("Enter the age of student " + (i+1) + " : ");
            int  age = input.nextInt();
            boolean vote_checker = output.canStudentVote(age);
            if ( vote_checker == true)
            {
                System.out.println("Can vote");
            }
            else
            {
                System.out.println("Can not vote");
            }
        }          
    }
}