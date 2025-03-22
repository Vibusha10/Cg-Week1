import java.util.Scanner;
public class Program2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0 ; i < 3 ; i++)
        {
		    System.out.print("Enter the age of friend " +  (i+1) + " : " );
		    age[i] = input.nextInt();
            System.out.print("Enter the height of friend " +  (i+1) + " : " );
            height[i] = input.nextInt();
        }

        int youngest = age[0];
        int tallest = height[0];	

        for (int i = 1 ; i < 3 ; i++)
        {
		    if (age[i]<youngest)
            {
                youngest = age[i];
            }
            if (height[i]>tallest)
            {
                tallest = height[i];
            }
        }		

		System.out.println(youngest + " is the youngest");
        System.out.print(tallest + " is the tallest");
    }
}