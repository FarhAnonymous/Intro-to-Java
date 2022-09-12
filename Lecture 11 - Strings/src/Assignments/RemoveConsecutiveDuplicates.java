package Assignments;

public class RemoveConsecutiveDuplicates {
	
	public static String removeDuplicates(String str) {

		String result = "";
		char currentCh = str.charAt(0);
		result += currentCh;

		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != currentCh) {
				result += str.charAt(i);
				currentCh = str.charAt(i);
			}

		}
		return result;
	
	}

	public static void main(String[] args) {
		String str = "aabbbcc";
		
		System.out.println(removeDuplicates(str));
}
}
