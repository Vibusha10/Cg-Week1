import java.util.Scanner;

public class CharacterFrequency {

    public static char[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        char[][] result = new char[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = (char) i;
                result[index][1] = (char) (frequency[i] + '0'); 
                index++;
            }
        }

        return result;
    }

    public static void displayFrequency(char[][] frequencyArray) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (char[] entry : frequencyArray) {
            System.out.println("    " + entry[0] + "     |     " + (entry[1] - '0'));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[][] frequencyArray = findCharacterFrequency(str);
        displayFrequency(frequencyArray);
    }
}
