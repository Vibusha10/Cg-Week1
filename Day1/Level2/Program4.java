import java.util.Scanner;
public class TemperatureConversion
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of celsius : ");
		float celsius = input.nextFloat();
		float fahrenheitResult = (celsius * 9 / 5) + 32;
		System.out.print("The " + celsius +" celsius is " + fahrenheitResult + " fahrenheit");
		input.close();
	}
}