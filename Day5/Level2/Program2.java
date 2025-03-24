import java.util.Scanner;
import java.util.Arrays;
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

    public static String[] string_split(String str,int count){
        int spacecount = 0;

        for (int i = 0; i < count; i++){
            if (str.charAt(i) == ' '){
                spacecount++;
            }
        } 

        int[] space = new int[spacecount+2];
        space[0] = 0;
        int index = 1;

        for (int i = 0; i < count; i++){
            if (str.charAt(i) == ' '){
                space[index] = i;
                index++;
            }
        }     
        space[index] = count;       
        String[] words = new String[index];

        for(int i = 0 ; i < index  ; i++){
            words[i] = str.substring(space[i],space[i+1]).trim();                       
        }
        return words;
    }

    public static boolean string_equal(String[] str1,String[] str2){
        for(int i = 0 ; i < str1.length ; i++){
                if(str1[i] != str2[i]){
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.next();

        int count_user = string_count(str);
        String[] words = string_split(str,count_user);

        String[] words_built = str.split(" ");

        System.out.println("Both methods give the same result : " + (string_equal(words,words_built)));
        System.out.println("Both methods give the same result : " + (Arrays.equals(words,words_built)));
    }
}