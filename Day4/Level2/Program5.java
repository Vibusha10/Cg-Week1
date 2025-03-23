import java.util.Scanner;
public class Program5
{
    public static double convertYardsToFeet(double yards)
    {
        return yards * 3;
    }

    public static double convertFeeetToYards(double feet)
    {
        return feet * 0.333333;       
    }

    public static double convertMetersToInches(double meters)
    {
        return meters * 39.3701;       
    }

    public static double convertInchesToMeters(double Inches)
    {
        return Inches * 0.0254;       
    }

    public static double convertInchesTocm(double Inches)
    {
        return Inches * 2.54;       
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in yards : ");
        double yards = input.nextDouble();

        System.out.print("Enter value in feet : ");
        double feet = input.nextDouble();

        System.out.print("Enter value in meter : ");
        double meters = input.nextDouble();
        
        System.out.print("Enter value in inch: ");
        double inches = input.nextDouble();

         System.out.println("Yards to Feet : " + convertYardsToFeet(yards));
         System.out.println("Feet to Yards : " + convertFeeetToYards(feet));
         System.out.println("Meters to inches : " +convertMetersToInches(meters));
         System.out.println("Inches to Meters : " + convertInchesToMeters(inches));
         System.out.println("Inches to CM : " + convertInchesTocm(inches));
    }
}