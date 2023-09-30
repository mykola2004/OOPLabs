/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.Add(""));
    }

    @Test
    public void testSingleNumber() {
        assertEquals(1, StringCalculator.Add("1"));
    }

    @Test
    public void testTwoNumbers() {
        assertEquals(3, StringCalculator.Add("1,2"));
    }
}