import java.util.Scanner;
public class Program11
{
    public static double[][] employee_data(){
        double[][] salary_years_of_experience = new double[10][2];
        for (int i = 0 ; i < 10 ; i++){
            salary_years_of_experience[i][0] = (int)(Math.random() * 90000) + 10000;
            salary_years_of_experience[i][1] = (int)(Math.random() * 51) ;
        }        
        return salary_years_of_experience;
     }

    public static double[][] employee_new_salary_bonus(double[][] salary_years_of_experience){
        double[][] new_salary_bonus= new double[10][2];
        for (int i = 0 ; i < 10 ; i++){
            if ( salary_years_of_experience[i][1] > 5){
                new_salary_bonus[i][0] =  (salary_years_of_experience[i][0] * 5)/100;
                new_salary_bonus[i][1] = salary_years_of_experience[i][0] + new_salary_bonus[i][0];
            }
            else if ( salary_years_of_experience[i][1] <= 5){
                new_salary_bonus[i][0] =  (salary_years_of_experience[i][0] * 2)/100;
                new_salary_bonus[i][1] = salary_years_of_experience[i][0] + new_salary_bonus[i][0];
            }
        }
        return new_salary_bonus;
    }

    public static void employee_new_details(double[][] salary_years_of_experience,double[][] new_salary_bonus){
        double total_bonus = 0;
        double old_salary = 0;
        double new_salary =0;
        for (int i = 0 ; i < 10 ; i++){
            total_bonus += new_salary_bonus[i][0];
            old_salary += salary_years_of_experience[i][0];
            new_salary += new_salary_bonus[i][1];
        }
        System.out.println("Total Bonus      : " + total_bonus);
        System.out.println("Total old salary : " + old_salary);
        System.out.println("Total new salary : " + new_salary);
        
    }

    public static void main(String[] args){
        double[][] salary_years_of_experience = employee_data();
        double[][] new_salary_bonus= employee_new_salary_bonus(salary_years_of_experience);
        employee_new_details(salary_years_of_experience,new_salary_bonus);
    }
}