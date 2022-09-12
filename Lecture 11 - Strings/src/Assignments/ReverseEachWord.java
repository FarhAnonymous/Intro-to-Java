package Assignments;

public class ReverseEachWord {
	
	public static String reverseWords(String str) {
		int start = 0;
		int i = start + 1;
		String reversed = "";
		String output = "";
		
		while(i < str.length()) {
			if(str.charAt(i) == ' ') {
				for(int j = start; j < i; j++) {
					reversed = str.charAt(j) + reversed;
					
				}
				output += reversed + " ";
				start = i+1;
			}
			reversed = "";
			i++;
		}
		for(int k = start; k < str.length(); k++) {
			reversed = str.charAt(k) + reversed;
		}
		output += reversed;
		return output;
		
	}

	public static void main(String[] args) {
		String str = "Welcome to Coding Ninjas";
		
		System.out.println(reverseWords(str));

	}

}
