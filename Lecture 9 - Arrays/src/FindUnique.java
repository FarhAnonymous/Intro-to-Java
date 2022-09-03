import java.util.Scanner;

public class FindUnique {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			return arr;
		}
		
	public static int findUniq(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			int j;
			for(j = 0; j < arr.length; j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						break;
					}
				}
			}
			if(j == arr.length) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t > 0) {
			int arr[] = takeInput();
			System.out.println(findUniq(arr));
			
			t--;
		}
		
		
	}

}
