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

    public static String[][] array_length(String[] str){
        String[][] words_len = new String[str.length][2];
        for(int i = 0 ; i < str.length ; i++){
            words_len[i][0] = str[i];
            words_len[i][1] = String.valueOf(str[i].length());                        
        }
        return words_len;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String str = input.nextLine();

        int count_user = string_count(str);
        String[] words = string_split(str,count_user);

        String[][] word_length = array_length(words);

        System.out.println("Word \t Length");
         for(int i = 0 ; i < word_length.length; i++){
            System.out.println(word_length[i][0] + " \t " + Integer.parseInt(word_length[i][1]));
         }
        
    }
}