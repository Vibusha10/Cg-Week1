import java.util.Scanner;
public class Program11
{
    public static double[] roots(double delta,int a,int b, int c)
    {
        if (delta >= 0)
        {
            double root1 =(double) (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (double)(-b - Math.sqrt(delta)) / (2 * a);
            double root3 = (double)(-b) / (2 * a);

            return new double[] {root1,root2,root3};
        }
        else
        {
            return new double[0];
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = input.nextInt();

        System.out.print("Enter value of b : ");
        int b = input.nextInt();

        System.out.print("Enter value of c : ");
        int c = input.nextInt();

        double delta = Math.pow(b,2) + 4 * a * c;

        double[] array = roots(delta,a,b,c);

        System.out.println("Roots are ");

        for (double i : array)
        {
            System.out.println(i);
        }
    }
}