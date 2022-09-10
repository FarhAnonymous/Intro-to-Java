import java.util.Scanner;

public class AllSubstrings {
	
	public static void printSubstrings(String str) {
		 for(int i = 0; i<str.length(); i++) {
			 System.out.println(str.charAt(i));
			 for(int j = i+2; j<=str.length(); j++) {
				 System.out.println(str.substring(i, j));
			 }
		 }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		printSubstrings(str);

	}

}
