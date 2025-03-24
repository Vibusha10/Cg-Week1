import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry (60-100)
            scores[i][2] = rand.nextInt(41) + 60; // Math (60-100)
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        int numStudents = scores.length;
        double[][] stats = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 300.0) * 100 * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }

    public static String[] assignGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            }
            else if (percentage >= 70){
                grades[i] = "B";
            }
            else if (percentage >= 60){
                grades[i] = "C";
            }
            else if (percentage >= 50){
                grades[i] = "D";
            }
            else if (percentage >= 40){
                grades[i] = "E";
            }
            else grades[i] = "R";
        }
        return grades;
    }

    public static void displayResults(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] +
                               "\t" + (int)stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[] grades = assignGrades(stats);
        displayResults(scores, stats, grades);
    }
}
