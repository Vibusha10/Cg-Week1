import java.util.Scanner;
public class Program2
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

        Program2 number_of_handshakes = new Program2();
        int possible_combination = number_of_handshakes.maxHandshakes(numberOfStudents);
        System.out.print(possible_combination + " is the maximum number of handshakes among the students");
    }
}