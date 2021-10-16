package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() {

		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {
		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	public void commaSepratedTwoNumbersReturnsSum() {
		assertEquals(9 + 5, stringCalculator.add("9,5"));
	}
	
	public void handlingOfUnknownAmountOfNumbers() {
		assertEquals(3+7+18+45+33+88,stringCalculator.add("3,7,18,45,33,88"));
	}
	
	
	
}
