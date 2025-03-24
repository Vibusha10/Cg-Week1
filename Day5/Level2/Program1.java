import java.util.Scanner;
public class string_ops
{
    public static int string_count(String str){
        int count = 0;
        try{
            while (true){
                str.charAt(count);
                count++;
            }
        }
        catch(Exception e){
            return count;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.next();

        int count_user = string_count(str);
        int count_built = str.length();

        System.out.println("Both methods give the same result : " + (count_user == count_built));
    }
}