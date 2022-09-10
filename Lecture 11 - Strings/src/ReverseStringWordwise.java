import java.util.Scanner;

public class ReverseStringWordwise {

	public static String reverseWords(String input) {
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			if (input.charAt(i) == ' ') {
				output = output + input.substring(i + 1, end) + " ";
				end = i;
			}
			i--;

		}
		output += input.substring(i + 1, end);
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(reverseWords(input));
	}

}
