import java.util.Scanner;
public class exception_handling
{
    public static String string_access(String str,int start , int end){
        return (str.substring(start,end));
     }

     public static void handleException(){
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter String : ");
            String str = input.nextLine();

            System.out.print("Enter the Start index : ");
            int start = input.nextInt();

            System.out.print("Enter the End index : ");
            int end = input.nextInt();

            System.out.print(string_access(str,start , end));
        }
        catch(IllegalArgumentException e){
            System.out.println("Error IllegalArgumentException : " + e);
        }
        catch(RuntimeException e){
            System.out.println("Error RuntimeException : " + e);
        }
     }

    public static void main(String[] args){
        System.out.println("\nHandling Exception:");
        handleException();
    }
}