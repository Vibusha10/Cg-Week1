import java.util.Scanner;
public class operators
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a : ");
		int a = input.nextInt();
		System.out.print("Enter the value of b : ");
		int b = input.nextInt();
		System.out.print("Enter the value of c : ");
		int c = input.nextInt();
		int operation1 = a + b * c;
		int operation2 = a * b + c;	
		int operation3 = c + a / b;
		int operation4 = a % b + c;
		System.out.print("The results of Int Operations are " + operation1  + " , " + operation2 + " , " + operation3 + " ,and " + operation4);
		input.close();
	}
}