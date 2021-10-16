package calculator;

class StringCalculator {

	public int add(final String numbers) {
		String delimiter = ",|n";
		String numbersWithoutDelimiter = numbers;
		if (numbers.startsWith("//")) {
			int delimiterIndex = numbers.indexOf("//") + 2;
			delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
			numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
		}
		return add(numbersWithoutDelimiter, delimiter);
	}

	public int add(String input, String delimiter) {
		int returnVal = 0;
		String[] numArr = input.split(",|\n");

		for (String num : numArr) {
			if (!num.trim().isEmpty()) {
				returnVal += Integer.parseInt(num);
			}
		}
		return returnVal;

	}

}