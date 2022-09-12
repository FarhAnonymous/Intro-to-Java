package Assignments;

public class RemoveCharacter {

	public static String removeCharacter(String str, char ch) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				output += str.charAt(i);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "aabccbaa";
		char ch = 'a';

		System.out.println(removeCharacter(str, ch));

	}

}
