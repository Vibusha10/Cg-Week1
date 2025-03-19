import java.util.Scanner;
public class salary
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the salary amount : ");
		float salary = input.nextFloat();
		System.out.print("Enter the bonus amount : ");
		float bonus = input.nextFloat();
		float salary_after_bonus = salary + bonus;
		System.out.print("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + salary_after_bonus);
		input.close();
	}
}