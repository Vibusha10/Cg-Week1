import java.util.Scanner;
public class string_ops
{
    public static String string_lower_check(char c){
        if ((c >=65) && ( c<=90)){
            c = (char) (c+32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    
    public static int[] count(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String type = string_lower_check(c);

            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[] {vowelCount,consonantCount};
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a char : ");
        char c = input.next().charAt(0);
        String check = string_lower_check(c);

        System.out.println("Character type : " + check);

        input.nextLine();

        System.out.print("Enter String : ");
        String str = input.nextLine();

        int[] count = count(str);

        System.out.println("vowel Count : " + count[0]);
        System.out.println("consonant Count : " + count[1]);
    }
}