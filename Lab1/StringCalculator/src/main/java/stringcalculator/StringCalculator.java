package stringcalculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringCalculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split(",");
        int sum = 0;

        for (String num : numberArray) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}