import java.util.Scanner;

public class PairSum {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			return arr;
		}
	
	public static int pairSum(int arr[], int x) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == x) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t > 0) {
			int input[] = takeInput();
			int x = in.nextInt();
			pairSum(input, x);
			t--;
		}
	}

}
