import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) return "Draw";
        if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = ((double) userWins / totalGames) * 100;
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;
        return new String[][] {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWinPercentage)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercentage)}
        };
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Category\tWins\tWin Percentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numGames = input.nextInt();
        input.nextLine();

        String[][] gameResults = new String[numGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(gameResults, stats);
    }
}
