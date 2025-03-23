import java.util.Scanner;
public class Program1
{
    static float simpleInterest(int principal,int rate,int time)
    {
        float simple_interest = (principal * rate * time) / 100;
        return simple_interest;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        int principal_amount = input.nextInt();

        System.out.print("Enter the rate of interest : ");
        int rate_of_interest = input.nextInt();

        System.out.print("Enter the time taken : ");
        int time_taken = input.nextInt();

        Program1 interest = new Program1();
        float amount = interest.simpleInterest(principal_amount,rate_of_interest,time_taken);
        System.out.print("\nThe Simple Interest is "+ amount + "for Principal " + principal_amount + ", Rate of Interest " + rate_of_interest + " and Time " + time_taken);
    }
}
