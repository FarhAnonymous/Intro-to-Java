import java.util.Scanner;

public class SwapAlternate {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	public static void swapAlternate(int arr[]) {
		for(int i = 0; i < arr.length-1; i=i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			}
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t > 0) {
			int arr[] = takeInput();
			swapAlternate(arr);
			
			t--;
		}
	

	}

}
