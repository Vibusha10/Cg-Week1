import java.util.Scanner;
public class Program12
{
    public static int[][] Student_marks(int number){
        int marks[][] = new int[number][3];
        for( int i = 0 ; i < number ; i++ ){
            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }   
        return marks;
    }
    
    public static float[][] percentage_average(int[][] marks){
        float percentage[][] = new float[marks.length][3]; 
        for( int i = 0 ; i < marks.length ; i++ ){
            percentage[i][0] = Math.round((marks[i][0] + marks[i][1] + marks[i][2]) * 100) / 100; 
            percentage[i][1] = Math.round((percentage[i][0] / 3) * 100) / 100; 
            percentage[i][2] = Math.round((percentage[i][0] / 3) * 100 ) / 100;
        }
        return percentage;
    }

    public static void percentage_average(float[][] percentage,int[][] marks){
        System.out.println("\nStudent\tMaths\tPhysics Chemistry  Total\tAverage\tPercentage");
        for( int i = 0 ; i < percentage.length;i++ ){
            System.out.println((i + 1)+ "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t   " + percentage[i][0] + "\t" + percentage[i][1] + "\t" + percentage[i][2]);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons : ");
        int number = input.nextInt();

        int[][] marks = Student_marks(number);
        float[][] percentage = percentage_average(marks);
        percentage_average(percentage,marks);
    }
}