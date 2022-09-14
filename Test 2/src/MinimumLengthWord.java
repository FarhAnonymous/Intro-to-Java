
public class MinimumLengthWord {

	public static String minLength(String input) {
		int minStart = -1;
		int minLength = Integer.MAX_VALUE;
		int currentStart = 0;
		int i = 0;

		for (; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				int currentWordLength = i - currentStart;
				if (currentWordLength < minLength) {
					minStart = currentStart;
					minLength = currentWordLength;
				}
				currentStart = i + 1;
			}
		}
		if (minStart == -1) {
			return input;
		} else {
			int currentWordLength = i - currentStart;
			if (currentWordLength < minLength) {
				minStart = currentStart;
				minLength = currentWordLength;
			}
			return input.substring(minStart, minStart + minLength);
		}
	}

	public static void main(String[] args) {
		String input = "this is test string";
		String word = minLength(input);
		System.out.println(word);

	}

}
