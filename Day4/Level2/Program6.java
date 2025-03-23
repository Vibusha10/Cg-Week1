import java.util.Scanner;
public class Program6
{
    public static double convertFahrenheitToCelcius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelciusToFahrenheit(double celcius)
    {
        return (celcius * 9 / 5) +32;       
    }

    public static double convertPoundsToKilograms(double pounds)
    {
        return pounds * 0.453592;       
    }

    public static double convertKilogramToPounds(double kilogram)
    {
        return kilogram * 2.20462 ;       
    }

    public static double convertGallonsToLitre(double gallons)
    {
        return gallons * 3.78541;       
    }

    public static double convertLitreToGallons(double litre)
    {
        return litre * 0.264172;       
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in farhrenheit : ");
        double fahrenheit = input.nextDouble();

        System.out.print("Enter value in celcius : ");
        double celcius = input.nextDouble();

        System.out.print("Enter value in pounds : ");
        double pounds = input.nextDouble();
        
        System.out.print("Enter value in kilogram : ");
        double kilogram = input.nextDouble();

        System.out.print("Enter value in gallons : ");
        double gallons = input.nextDouble();

        System.out.print("Enter value in litre : ");
        double litre = input.nextDouble();

         System.out.println("Fahrenheit to Celcius : " + convertFahrenheitToCelcius(fahrenheit));
         System.out.println("Celcius to Fahrenheit : " + convertCelciusToFahrenheit(celcius));
         System.out.println("Pound to Kilograms : " + convertPoundsToKilograms(pounds));
         System.out.println("Kilogram to Pound : " + convertKilogramToPounds(kilogram));
         System.out.println("Gallons to Litre : " + convertGallonsToLitre(gallons));
         System.out.println("Litre to Gallons : " +convertLitreToGallons(litre));
    }
}