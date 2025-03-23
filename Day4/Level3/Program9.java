import java.util.Scanner;
public class Euclidean{
    public static double Euclidean_distance(int x1,int y1,int x2,int y2){
        double power = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        double distance = Math.sqrt(power);
        return distance;
    }

    public static double[] slope_intercept(int x1,int y1,int x2,int y2){
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        return new double[] {m,b};
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("The first point value on x axis : " );
        int x1 = input.nextInt();

        System.out.print("The first point value on y axis : " );
        int y1 = input.nextInt();

        System.out.print("The second point value on x axis : " );
        int x2 = input.nextInt();

        System.out.print("The second point value on y axis : " );
        int y2 = input.nextInt();

        double distance = Euclidean_distance(x1,y1,x2,y2);
        System.out.println("The Euclidean Distance between the points is " + distance);

        double array[] = slope_intercept(x1,y1,x2,y2);
        System.out.println("The Slope between the points is " + array[0]);
        System.out.println("The Intercept between the points is " + array[0]);
    }
}