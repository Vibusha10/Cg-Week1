import java.util.Scanner;
public class StringTrim {
    public static int[] trimIndexes(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' '){
            start++;
        }
        while (end >= start && str.charAt(end) == ' '){
            end--;
        }
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.nextLine();

        int[] indexes = trimIndexes(str);
        String trimmedCustom = customSubstring(str, indexes[0], indexes[1]);
        String trimmedBuiltIn = str.trim();

        System.out.println("Trimmed String (Custom): " + trimmedCustom);
        System.out.println("Trimmed String (Built-in): " + trimmedBuiltIn);
        System.out.println("Strings Match: " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
