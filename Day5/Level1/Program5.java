import java.util.Scanner;
public class exception_handling
{
    public static void string_access(String str){
        for(int i = 0; i < str.length() + 1 ; i ++){
            System.out.print(str.charAt(i));
        }
     }

    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Enter String : ");
            String str = input.nextLine();
            string_access(str);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("\nError : " + e);
        }
    }
}