import java.util.Scanner;
public class string_ops
{
    public static String string_upper(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            char c =  str.charAt(i);
            if ((c >=97) && ( c<=122)){
                sb.append((char) (c-32));
            }
            else{
                 sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean string_equal(String str1,String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        else{
            for(int i = 0 ; i < str1.length() ; i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    return false;
                }
            }
            return true; 
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.nextLine();

        String upper = string_upper(str);

        String to_upper = str.toUpperCase();
        
        System.out.println("Checking the user input string and converted string is equal : " + (string_equal(str,upper)));
        System.out.println("Both methods give the same result : " + upper.equals(to_upper));
    }
}