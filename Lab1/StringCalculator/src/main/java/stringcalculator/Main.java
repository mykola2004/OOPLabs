package stringcalculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String input1 = "";           // Empty string
        String input2 = "1";          // Single number
        String input3 = "1,2";        // Two numbers
        String input4 = "1\n2,3";     // New lines and commas as separators
        String input5 = "1\n2\n3,4";  // Multiple new lines

        System.out.println("Result 1: " + StringCalculator.Add(input1)); // Output: 0
        System.out.println("Result 2: " + StringCalculator.Add(input2)); // Output: 1
        System.out.println("Result 3: " + StringCalculator.Add(input3)); // Output: 3
        System.out.println("Result 4: " + StringCalculator.Add(input4)); // Output: 6
        System.out.println("Result 5: " + StringCalculator.Add(input5)); // Output: 10
    }
}