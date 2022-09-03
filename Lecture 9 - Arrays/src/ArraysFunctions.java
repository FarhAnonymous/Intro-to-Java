import java.util.Scanner;

public class ArraysFunctions {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
	public static void giveOutput(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		int arr2[] = takeInput();
		giveOutput(arr2);
	}

}
