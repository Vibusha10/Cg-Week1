import java.util.Scanner;
import java.util.Arrays;
public class string
{
    public static char[] string_equal(String str){
        char[] array = new char[str.length()];
        for(int i = 0 ; i < str.length(); i++){
            array[i] = str.charAt(i);
        }
        return array;
    }

    public static boolean string_array_equal(String str,char[] array){
        for(int i = 0 ; i < str.length(); i++){
            if(array[i] != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

     public static boolean string_compare(char[] str1,char[] str2){
        return  Arrays.equals(str1,str2);
     }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the String : ");
        String str = input.next();

        char[] eq = string_equal(str);
        char[] eq_b = str.toCharArray();
        System.out.println("Both methods give the same result : " + string_array_equal(str,eq));
        System.out.println("Both methods give the same result : " + string_compare(eq,eq_b) );
    }
}