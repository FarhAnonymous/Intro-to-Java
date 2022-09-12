package Assignments;

public class CompressTheString {

	public static String compressedString(String str) {
		int i, c = 1, j = 0;
		String result = "";
		for (i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i + 1) == str.charAt(i)) {
				c++;
			} else {
				if (c != 1)
					result = result + str.charAt(i) + c;
				else
					result = result + str.charAt(i);
				c = 1;
			}
		}
		if (c != 1)
			result = result + str.charAt(i) + c;
		else
			result = result + str.charAt(i);
		return result;
	}

	public static void main(String[] args) {
		String str = "aaabbccdsa";

		System.out.println(compressedString(str));

	}

}
