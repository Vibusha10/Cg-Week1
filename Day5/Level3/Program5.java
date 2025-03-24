import java.util.Scanner;

public class UniqueCharacterFrequency {

    public static char[] uniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }

        return uniqueChars.toString().toCharArray();
    }

    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void displayFrequency(String[][] frequencyArray) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");

        for (String[] entry : frequencyArray) {
            System.out.println("    " + entry[0] + "     |     " + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[][] frequencyArray = findCharacterFrequency(str);
        displayFrequency(frequencyArray);
    }
}
