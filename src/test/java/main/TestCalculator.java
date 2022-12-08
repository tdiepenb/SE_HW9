package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    void Should_add_two_numbers_and_return_result() {
        // Implement
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_substract_two_numbers_and_return_result() {
        // Implement
        int expectedResult = 2 - 3;
        int actualResult = calculator.sub(2, 3);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void Should_multiply_two_numbers_and_return_result() {
        // Implement
        int expectedResult = 2 * 3;
        int actualResult = calculator.multiply(2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_divide_two_numbers_and_return_result() {
        // Implement

        float expectedResult = (float) 2 / 3;
        float actualResult = calculator.divide(2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        // Implement

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(2, 0);
        });

//		Exception thrown = assertThrows(ArithmeticException.class, () -> {
//			calculator.divide(2, 0);
//		});
//		String expectedMessage = "ZeroDivisionError";
//		String actualMessage = thrown.getMessage();
//		assertTrue(actualMessage.contains(expectedMessage));
    }
}
