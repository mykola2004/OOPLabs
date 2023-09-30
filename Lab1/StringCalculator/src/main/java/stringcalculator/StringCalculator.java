package stringcalculator;

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
