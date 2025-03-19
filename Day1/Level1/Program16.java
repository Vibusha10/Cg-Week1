import java.util.Scanner;
public class Price
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of students : ");
		int no_of_students = input.nextInt();
		float possible_handshakes = ((float)no_of_students * ((float)no_of_students-1)) / 2;
		System.out.print("The maximum number of handshakes among " + no_of_students + " number of students is " + (int)possible_handshakes);
		input.close();
	}
}