import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray();
        int[] frequency = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '0') {
                continue;
            }
            frequency[i] = 1;

            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    frequency[i]++;
                    charArray[j] = '0'; // Mark duplicate character as counted
                }
            }
        }

        int uniqueCount = 0;
        for (char c : charArray) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                result[index++] = charArray[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    public static void displayFrequency(String[] frequencyArray) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");

        for (String entry : frequencyArray) {
            System.out.println("    " + entry.replace(" - ", "     |     "));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String[] frequencyArray = findCharacterFrequency(str);
        displayFrequency(frequencyArray);
    }
}