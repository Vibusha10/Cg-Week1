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
    
    public static String[][] define_char(String str) {
        String[][] array = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            array[i][0] = String.valueOf(c);
            String type = string_lower_check(c);

            if (type.equals("Vowel")) {
                array[i][1] = "Vowel";
            } else if (type.equals("Consonant")) {
                array[i][1] = "Consonant";
            }
        }
        return array;
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

        String[][] array = define_char(str);
        System.out.println("Char\tType");
        for(String[] i : array){
            System.out.println(i[0] + "\t" + i[1]);
        }      
    }
}