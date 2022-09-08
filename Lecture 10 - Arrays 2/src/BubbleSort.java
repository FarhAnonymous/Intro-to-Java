import java.util.Scanner;

public class BubbleSort {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < n; j++) {
			arr[j] = in.nextInt();
		}
		return arr;
	}
	
	public static void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length-1; i++ ) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t > 0) {
			int input[] = takeInput();
			bubbleSort(input);
			for(int i = 0; i < input.length; i++) {
				System.out.print(input[i] + " ");
			
		    t--;
		    
			
		}

	}

}
}
