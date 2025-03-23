import java.util.Scanner;
public class collinear{
    public static void collinear_checker(int x1,int y1,int x2,int y2,int x3,int y3){
        float slope1 = (y2 -y1) / (x2 - x1);
        float slope2 = (y3 -y2) / (x3 - x2);
        float slope3 = (y3 -y1) / (x3 - x1);

        if ((slope1 == slope2) && (slope2== slope3)){
            System.out.println("The points are collinear");
        }
        else{
            System.out.println("The points are not collinear");
        }
    }

    public static void collinear_checker_area(int x1,int y1,int x2,int y2,int x3,int y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        if (area == 0){
            System.out.println("The points are collinear");
        }
        else{
            System.out.println("The points are not collinear");
        }
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

        System.out.print("The third point value on x axis : " );
        int x3 = input.nextInt();

        System.out.print("The third point value on y axis : " );
        int y3 = input.nextInt();

        collinear_checker(x1,y1,x2,y2,x3,y3);

        collinear_checker_area(x1,y1,x2,y2,x3,y3);     
     }
}