package stringcalculator;

public class StringCalculator {

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split("[,\n]");
        int sum = 0;

        for (String num : numberArray) {
            if (num.isEmpty()) {
                throw new IllegalArgumentException("Invalid input: Two delimiters without a number in between.");
            }
            if (!num.trim().isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }
}
