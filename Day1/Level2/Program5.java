import java.util.Scanner;
public class TemperatureConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of fahrenheit : ");
		float fahrenheit = input.nextFloat();
		float celsiusResult = (fahrenheit - 32) * 5 / 9;
		System.out.print("The " + fahrenheit +" fahrenheit is " + celsiusResult + " celsius");
		input.close();
	}
}