import java.util.Scanner;
public class Program4
{
    public float number_of_round(int side1,int side2,int side3)
    {
        int perimeter = side1 + side2 + side3;
        float rounds = (float) 5000 / perimeter;
        return rounds;
    }    

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

		System.out.print("Enter the first side : ");
		int side1 = input.nextInt();
		System.out.print("Enter the second side : ");
		int side2 = input.nextInt();
		System.out.print("Enter the third side : ");	
		int side3 = input.nextInt();

        Program4 calculation = new Program4();
        float no_of_rounds = calculation.number_of_round(side1,side2,side3);
        System.out.print("The total number of rounds the athlete will run is " + no_of_rounds + " to complete 5 km");
    }
}