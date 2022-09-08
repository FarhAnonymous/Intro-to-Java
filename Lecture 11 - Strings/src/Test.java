
public class Test {
	
	public static void main(String[] args) {
		String str = "Farhan";
		String str2 = " is a smart guy.";
		String str3 = "Farhan";
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.concat(str2));
		System.out.println(str.compareTo(str3));
		
		String str4 = "FarhAnonymous";
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(0, 6));
		
		String reversed = "";
		for(int i = str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		if(reversed != str) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		
		
	}

}
