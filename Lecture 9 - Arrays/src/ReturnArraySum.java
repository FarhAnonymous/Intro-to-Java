import java.util.Scanner;

public class ReturnArraySum {
	
	public static int[] takeIn() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			return arr;
		}
		
		
	public static int giveSum(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
		
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t>0) {
		
		int arr[] = takeIn();
		int sum = giveSum(arr);
		System.out.println(sum);
		t--;
		
		}
		

	}

}
