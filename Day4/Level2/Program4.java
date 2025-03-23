import java.util.Scanner;
public class Program4
{
    public static double convertKmToMiles(double km)
    {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles)
    {
        return miles * 1.60934;       
    }

    public static double convertMetersToFeet(double meters)
    {
        return meters * 3.28084;       
    }

    public static double convertFeetToMeters(double feet)
    {
        return feet * 0.3048;       
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in km : ");
        double km = input.nextDouble();

        System.out.print("Enter value in miles : ");
        double miles = input.nextDouble();
        
        System.out.print("Enter value in meters : ");
        double meters = input.nextDouble();
        
        System.out.print("Enter value in feet : ");
        double feet = input.nextDouble();

         System.out.println("KM to Miles : " + convertKmToMiles(km));
         System.out.println("Miles to KM : " + convertMilesToKm(miles));
         System.out.println("Meters to Feet : " + convertMetersToFeet(meters));
         System.out.println("Feet to Meters : " + convertFeetToMeters(feet));
    }
}
