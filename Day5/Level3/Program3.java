import java.util.Scanner;

public class FirstNonRepeatingChar {
    
    public static char findFirstNonRepeatingChar(String str) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);

        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
