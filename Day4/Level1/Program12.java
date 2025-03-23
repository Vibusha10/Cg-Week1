import java.util.*;
public class Program12
{
    public double[] calculateTrigonometricFunctions(double angle)
    {
        double radians = (angle * Math.PI) / 180;

        double Sine = Math.sin(radians);
        double Cosine = Math.cos(radians);
        double Tangent = Math.tan(radians);

        return new double[] {Sine,Cosine,Tangent};       
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle in degree : ");
        double degree =input.nextDouble();
        
        Program12 trig = new Program12();
        double[] array = trig.calculateTrigonometricFunctions(degree);

        System.out.println("Sine : " + array[0]);
        System.out.println("Cosineine : " + array[1]);
        System.out.println("Tangent : " + array[2]);
    }
}