import java.util.Scanner;

public class FahToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int S = in.nextInt();
		int E = in.nextInt();
		int W = in.nextInt();
		
		
		while(S <= E) {
			int SC = ((S - 32)*5)/9;
			System.out.println(S + " " + SC);
			S = S + W;
		}
		
	}

}
