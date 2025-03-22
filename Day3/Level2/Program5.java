import java.util.Scanner;
public class Program5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();
        
        int count = 0;
        int temp = number;

        while(temp!=0)
        {
            temp /= 10;
            count += 1;
        }

        int[] array = new int[count];
    
        for ( int i = 0 ; i < count ; i++)
        {
            array[i] = (int)number % 10;
            number/=10;
        } 

        System.out.print (" Digits after reverses : ");

        for ( int i = 0 ; i < count ; i++)
        {
            System.out.print(array[i]);    
        } 
    }
}