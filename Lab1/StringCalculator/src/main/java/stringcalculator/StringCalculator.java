package stringcalculator;

public class StringCalculator {

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//")) {
            if (numbers.contains("[")) {
                int delimiterEnd = numbers.indexOf("\n");
                if (delimiterEnd != -1) {
                    String customDelimiter = numbers.substring(3, delimiterEnd-1);
                    numbers = numbers.substring(delimiterEnd + 1);
                    numbers = numbers.replace(customDelimiter, ",");
                }
            }
            else{
                int delimiterEnd = numbers.indexOf("\n");
                if (delimiterEnd != -1) {
                    String customDelimiter = numbers.substring(2, delimiterEnd);
                    numbers = numbers.substring(delimiterEnd + 1);
                    numbers = numbers.replace(customDelimiter, ",");
                }
            }
        }

        String[] numberArray = numbers.split("[,\n]");
        int sum = 0;

        for (String num : numberArray) {
            if (!num.trim().isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }
}
