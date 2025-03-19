import java.util.Scanner;
public class pen
{
	public static void main(String[] args)
	{
		int number_of_pens = 14;
		int number_of_students = 3;
		int pens_equally_divided = (int)(number_of_pens / number_of_students);
		int remaining_pens = number_of_pens % number_of_students;
		System.out.print("The Pen Per Student is " + pens_equally_divided + " and the remaining pen not distributed is " + remaining_pens);
	}
}
