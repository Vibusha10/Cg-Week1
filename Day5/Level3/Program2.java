import java.util.Scanner;

public class UniqueCharacters {
    
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (str.charAt(count) != '\0') {
                count++;
            }
        } catch (Exception e) {
            return count;
        }
        return count;
    }

    public static char[] findUniqueCharacters(String str) {
        int length = getStringLength(str);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] uniqueChars = findUniqueCharacters(str);
        displayUniqueCharacters(uniqueChars);
    }
}
