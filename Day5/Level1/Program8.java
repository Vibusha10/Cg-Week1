import java.util.Scanner;
public class exception_handling
{
    public static void array_access(int[] array){
        for(int i = 0; i < array.length + 1 ; i ++){
            System.out.print(array[i]);
        }
    }

     public static void handleException(){
        Scanner input = new Scanner(System.in);
        try {
            int[] array = {1,2,3,4,5,6,7};

           array_access(array);
        }
        catch( ArrayIndexOutOfBoundsException  e){
            System.out.println("\nError ArrayIndexOutOfBoundsException  : " + e);
        }
        catch(RuntimeException e){
            System.out.println("\nError RuntimeException : " + e);
        }
     }

    public static void main(String[] args){
        System.out.println("Handling Exception:");
        handleException();
    }
}