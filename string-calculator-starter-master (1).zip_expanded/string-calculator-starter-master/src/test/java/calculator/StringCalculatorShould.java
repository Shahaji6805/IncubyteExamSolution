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

	@Test
	public void handlingOfUnknownAmountOfNumbers() {
		assertEquals(3 + 7 + 18 + 45 + 33 + 88, stringCalculator.add("3,7,18,45,33,88"));
	}

	@Test
	public void handleNewLineBetweenNumbers() {
		assertEquals(4 + 8 + 60, stringCalculator.add("4,8\n60"));
	}

	@Test
	public void supportDifferentDelimiter() {
		assertEquals(1 + 2, stringCalculator.add("//;\\n1;2"));
	}

	@Test
	public void negativeNumbersAreUsedThenRuntimeExceptionIsThrow() {
		RuntimeException exception = null;
		try {
			stringCalculator.add("4,-9,34,-78,22,18");
		} catch (RuntimeException e) {
			exception = e;
		}
		assertNotNull(exception);
		assertEquals("Negatives not allowed: [-9, -78]", exception.getMessage());
	}

	@Test
	public void getAddCount() {
		System.out.println("add Invoked " + stringCalculator.getCnt() + " times");
	}

	@Test
	public void NumbersBiggerThanHundredIsIgnored() {
		assertEquals(2, stringCalculator.add("2,1001"));
	}

	@Test
	public void delimitCanBeOfAnyLength() {

		assertEquals(6, stringCalculator.add("//[***]\n1***2***3"));
	}

	@Test
	public void allowMultipleDelimiters() {

		assertEquals(6, stringCalculator.add("//[*][%]\n1*2%3"));
	}

}
