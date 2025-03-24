import java.util.Scanner;
public class string_ops
{
    public static String string_substring(String str, int start ,int end){
        StringBuilder sb = new StringBuilder();
        for(int i = start ; i < end ; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.nextLine();

        System.out.print("Enter Start index : ");
        int start = input.nextInt();

        System.out.print("Enter End index : ");
        int end = input.nextInt();

        String eq = string_substring(str,start,end);
        String eq_b = str.substring(start,end);

        System.out.println("The substring: " + eq);
        System.out.println("Built-in substring method : " + eq_b);
        System.out.println("Both methods give the same result : " + (eq.equals(eq_b)));
    }
}