import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    // Define suits and ranks
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Initialize deck of cards
    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            System.out.println("Not enough cards in the deck!");
            return null;
        }

        String[][] players = new String[x][n];
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Display players and their cards
    public static void displayPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User inputs
        System.out.print("Enter the number of players: ");
        int numPlayers = input.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int numCards = input.nextInt();

        // Initialize, shuffle, and distribute deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, numCards, numPlayers);

        // Display players and their cards
        displayPlayers(players);
    }
}
