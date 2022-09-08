import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		boolean ans = isPalindrome(str);
		System.out.println(ans);
		

	}

}
