import java.util.Scanner;
public class Program3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the maths mark : ");
		int math = input.nextInt();
		
		System.out.print("Enter the physics mark : ");
		int physics = input.nextInt();
		
		System.out.print("Enter the chemistry mark : ");
		int chemistry = input.nextInt();
		
		float average_marks = (math + physics + chemistry)/3;
		
		if (average_marks >= 80)
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is A");
			System.out.print("\nLevel4, above agency-normalized standards");
		}
		else if (( 70 <= average_marks ) && (average_marks <=79))
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is B");
			System.out.print("\nLevel3, agency-normalized standards");
		}
		else if ( (60 <= average_marks ) && (average_marks <=69))
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is C");
			System.out.print("\nLevel2, below, but approaching agency-normalized standards");
		}
		else if ( (50 <= average_marks) && (average_marks <= 59) )
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is D");
			System.out.print("\nLevel1, well below agency-normalized standards");
		}
		else if ( ( 40 <= average_marks ) && (average_marks <=49) )
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is E");
			System.out.print("\nLevel1-, too below agency-normalized standards");
		}
		else
		{
			System.out.print("Average mark in PCM is " + average_marks);
			System.out.print("\nGrade is R");
			System.out.print("\nRemedial standards");
		}
	}
}