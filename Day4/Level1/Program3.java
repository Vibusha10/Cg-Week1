import java.util.Scanner;
public class Program3
{
    static int maxHandshakes(int number)
    {
        int combination = (number * (number-1)) / 2;
        return combination;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Students : ");
        int numberOfStudents = input.nextInt();

        Program3 number_of_handshakes = new Program3();
        int possible_combination = number_of_handshakes.maxHandshakes(numberOfStudents);
        System.out.print(possible_combination + " is the maximum number of handshakes among the students");
    }
}