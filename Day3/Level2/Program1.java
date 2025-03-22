import java.util.Scanner;
public class Program1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[][] salary_years_of_experience = new double[10][2];
        double[][] new_salary_bonus= new double[10][2];


        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.print("Enter employee" + (i+1) + " salary : " );
            salary_years_of_experience[i][0] = input.nextDouble();
            System.out.print("Enter employee " + (i+1) + " years of experience : " );
            salary_years_of_experience[i][1] = input.nextDouble();

            if ((salary_years_of_experience[i][0] < 0)  || (salary_years_of_experience[i][1] < 0))
            {
                System.out.println("Enter a valid input");
                i--;
                continue;
            }    
        } 

        double total_bonus = 0;
        double old_salary = 0;
        double new_salary =0;


        for (int i = 0 ; i < 10 ; i++)
        {
            if ( salary_years_of_experience[i][1] > 5)
            {
                new_salary_bonus[i][0] =  (salary_years_of_experience[i][0] * 5)/100;
                new_salary_bonus[i][1] = salary_years_of_experience[i][0] + new_salary_bonus[i][0];
                total_bonus += new_salary_bonus[i][0];
                old_salary += salary_years_of_experience[i][0];
                new_salary += new_salary_bonus[i][1];
            }
            else if ( salary_years_of_experience[i][1] <= 5)
            {
                new_salary_bonus[i][0] =  (salary_years_of_experience[i][0] * 2)/100;
                new_salary_bonus[i][1] = salary_years_of_experience[i][0] + new_salary_bonus[i][0];
                total_bonus += new_salary_bonus[i][0];
                old_salary += salary_years_of_experience[i][0];
                new_salary += new_salary_bonus[i][1];
            }
        }

        System.out.println("Total Bonus : " + total_bonus);
        System.out.println("Total old salary : " + old_salary);
        System.out.println("Total new salary : " + new_salary);
           
    }
}