import java.util.Scanner;
import static java.lang.System.out;
public class Program9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for row : ");
        int row = input.nextInt();

        System.out.print("Enter the value for column : ");
        int column = input.nextInt();

        int size = row * column;

        int[][] multidimensional_array = new int[row][column];
        int[] onedimensional_array = new int[size];

        int index = 0;

        System.out.println("Enter the array elements : ");

        for (int i = 0 ; i < row ; i++)
        {
            for (int j = 0 ; j < column ; j++)
            {
                multidimensional_array[i][j] = input.nextInt();
            }
            
        }

        for (int i = 0 ; i < row ; i++)
        {
            for (int j = 0 ; j < column ; j++)
            {
                onedimensional_array[index] = multidimensional_array[i][j];
                index += 1;
            }
        }

        out.print("One Dimensional : ");

        for (int k = 0 ; k < onedimensional_array.length ; k++)
        {
            out.print(onedimensional_array[k] + " ");
        }

    }
}