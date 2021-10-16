package calculator;

class StringCalculator {

	public int add(String input) {
		int returnVal = 0;
		String[] numArr= input.split(",");
		
		for (String number : numArr) {
			if (!number.trim().isEmpty()) { 
				returnVal += Integer.parseInt(number);
			}
		}
		return returnVal;

	}

}