public class Program10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char chToRemove = scanner.next().charAt(0);

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != chToRemove) {
                result = result + input.charAt(i);
            }
        }

        System.out.println("Modified String: " + result);

        scanner.close();
    }
}