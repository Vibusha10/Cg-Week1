public class Program6 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String subString = scanner.nextLine();

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index = index + subString.length();
        }

        System.out.println("Occurrences of substring: " + count);
        scanner.close();
    }
}
