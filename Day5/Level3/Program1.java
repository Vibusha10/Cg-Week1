import java.util.Scanner;

public class BMI_Calculator {
    
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return Math.round((weight / (heightM * heightM)) * 100.0) / 100.0;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] persons) {
        String[][] results = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double height = persons[i][1];

            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            results[i][0] = String.format("%.1f", height);
            results[i][1] = String.format("%.1f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nPerson\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        String[][] results = computeBMI(persons);
        displayResults(results);
    }
}
