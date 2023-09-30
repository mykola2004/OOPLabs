package stringcalculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String input1 = "";      // Empty string
        String input2 = "1";     // Single number
        String input3 = "1,2";   // Two numbers

        System.out.println("Result 1: " + StringCalculator.Add(input1)); // Output: 0
        System.out.println("Result 2: " + StringCalculator.Add(input2)); // Output: 1
        System.out.println("Result 3: " + StringCalculator.Add(input3)); // Output: 3
    }
}