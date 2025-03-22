import java.util.Scanner;
public class Program10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of elements of an array : ");
		int index = input.nextInt();  

        String[] array = new String[index];

		for ( int i = 0 ; i < index ; i++ )
		{
			if ( (i % 3 == 0) && (i % 5 == 0))
			{
			    array[i]="FizzBuzz";
			}
			else if (i % 3 == 0)
			{
				array[i]="Fizz";
			}
			else if (i % 5 == 0)
			{
				array[i]="Buzz";
			}
			else
			{
				array[i]= Integer.toString(i);
			}	
		}	

        for ( int i = 0 ; i < array.length ; i++ )
        {
            System.out.println(array[i]);
        }				
	}
}

