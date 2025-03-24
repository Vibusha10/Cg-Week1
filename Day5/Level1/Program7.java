import java.util.Scanner;
public class exception_handling
{
    public static int string_parsing(String str){
        return (Integer.parseInt(str));
     }

     public static void handleException(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter String : ");
            String str = input.nextLine();

            System.out.println("The integer is " + string_parsing(str));
        }
        catch(NumberFormatException e){
            System.out.println("Error NumberFormatException : " + e);
        }
     }

    public static void main(String[] args){
        System.out.println("\nHandling Exception:");
        handleException();
    }
}