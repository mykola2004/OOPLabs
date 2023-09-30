package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.startsWith("//") && (numbers.contains("][")) ) {
            int delimiterStart = numbers.indexOf("//")+2;
            int delimiterEnd = numbers.indexOf("\n")-1;
            if (delimiterStart != -1 && delimiterEnd != -1) {
                String customDelimiters = numbers.substring(delimiterStart + 1, delimiterEnd);
                numbers = numbers.substring(delimiterEnd + 2);
                for (String delimiter : customDelimiters.split("\\]\\[")) {
                    numbers = numbers.replace(delimiter, ",");
                }
            }
        }

        if (numbers.startsWith("//") && !(numbers.contains("]["))) {

            if (numbers.contains("[")) {
                int delimiterEnd = numbers.indexOf("\n");
                if (delimiterEnd != -1) {
                    String customDelimiter = numbers.substring(3, delimiterEnd-1);
                    numbers = numbers.substring(delimiterEnd + 1);
                    numbers = numbers.replace(customDelimiter, ",");
                }
            }
            else {
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
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : numberArray) {
            if (!num.trim().isEmpty()) {
                int parsedNum = Integer.parseInt(num);
                if (parsedNum < 0) {
                    negativeNumbers.add(parsedNum);
                } else if (parsedNum <= 1000) {
                    sum += parsedNum;
                }
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }
}
