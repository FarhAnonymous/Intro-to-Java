package Assignments;

public class HighestOccuringNum {

	public static char highestOccuring(String str) {
		int count = 0;
		int finalCount = 0;
		char ch = 'a';

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > finalCount) {
				ch = str.charAt(i);
				finalCount = count;
			}
			count = 0;
		}
		return ch;
	}

	public static void main(String[] args) {
		String str = "abdefgbabfba";
		System.out.println(highestOccuring(str));

	}

}
