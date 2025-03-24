import java.util.Scanner;
public class exception_handling
{
    public static int string_equal(){
        String text = null;
        int len = text.length();        
        return len;
     }

    public static void main(String[] args){
        try{
            System.out.print("The length of the string is " + string_equal());
        }
        catch(NullPointerException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}