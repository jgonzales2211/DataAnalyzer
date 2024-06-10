import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;

public class DataAnalyzer {
    public static void main(String[] args) {
        try {
            // Creates Scanner objects to read from files
            Scanner input1 = new Scanner(new File("input1.txt"));
            Scanner input2 = new Scanner(new File("input2.txt"));
            Scanner input3 = new Scanner(new File("input3.txt"));

            // Analyzes the data from each file
            analyzeData(input1);
            analyzeData(input2);
            analyzeData(input3);
        } catch (FileNotFoundException e) {
            // Handles the case where the file is not found
            System.out.println("File not found.");
        }
    }

    public static void analyzeData(Scanner input) {
        try {
            // Reads integers and doubles
            while (true) {
                int number = getNextInt(input);   // Get the next integer
                double value = getNextDouble(input); // Get the next double
                System.out.println("Number: " + number + ", Value: " + value);
            }
        } catch (NoSuchElementException e) {
            // Catches the exception when there are no more elements
            System.out.println("No more elements to read.");
        }
    }

    public static int getNextInt(Scanner input) {
        // Throws an exception if no more integers available
        if (!input.hasNextInt()) {
            throw new NoSuchElementException("No more integers available.");
        }
        return input.nextInt();
    }

    public static double getNextDouble(Scanner input) {
        // Throws an exception if no more doubles available
        if (!input.hasNextDouble()) {
            throw new NoSuchElementException("No more doubles available.");
        }
        return input.nextDouble();
    }
}
