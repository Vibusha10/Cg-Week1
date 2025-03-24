import java.util.Scanner;
public class string
{
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
        
        System.out.print("Enter String 1 : ");
        String str1 = input.next();

        System.out.print("Enter String 2 : ");
        String str2 = input.next();

        boolean eq = string_equal(str1,str2);
        boolean eq_b = str1.equals(str2);
        System.out.println("The strings are equal : " + eq);
        System.out.println("Built-in equals method : " + eq_b);
        System.out.println("Both methods give the same result : " + (eq == eq_b));
    }
}