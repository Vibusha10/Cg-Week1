import java.util.Scanner;
import static java.lang.System.out;
public class Program7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		out.print("Enter the weight in kg : ");
		int weight = input.nextInt();
		
		out.print("Enter the height in cm : ");
		int height = input.nextInt();
		
		float height_in_meter = height/100;
		
		double BMI = weight / ( height_in_meter * height_in_meter);
		
		if (BMI <= 18.4)
		{
			out.print("The person is underweight");
		}
		else if ((BMI > 18.4) && (BMI <= 24.9))
		{
			out.print("The person is Normal");
		}
		else if ((BMI >= 25.0) && (BMI <= 39.9))
		{
			out.print("The person is Overweight");
		}
		else
		{
			out.print("The person is Obese");
		}
	}
}