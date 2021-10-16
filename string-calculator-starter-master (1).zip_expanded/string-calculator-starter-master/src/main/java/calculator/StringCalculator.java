package calculator;

class StringCalculator {

	public int add(String input) {
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