package Assignments;

public class CheckPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		for(int i = 0; i < str1.length();) {
			for(int j = 0; j < str2.length();) {
				if(str1.charAt(i) != str2.charAt(j)) {
					j++;
				}
				if(str1.charAt(i) == str2.charAt(j)) {
					i++;
					break;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
       String str1 = "abcde";
       String str2 = "baedc";
       
       System.out.println(isPermutation(str1, str2));
		
		
	}

}
