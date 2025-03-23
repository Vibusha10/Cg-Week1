import java.util.Scanner;
public class Program11
{
    public double calculateWindChill(double temperature, double windSpeed)
    {
        double output = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow( windSpeed,0.16);
        return output;
    }

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature : ");
		double temperature = input.nextInt();

        System.out.print("Enter the windspeed : ");
        double windSpeed = input.nextInt();

        Program11 calculation = new Program11();
        double windchill = calculation.calculateWindChill(temperature,windSpeed);
        System.out.print("Wind Chill : " + windchill);
    }
}