import java.util.Scanner;

public class SelectionSort {
	
	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < n; j++) {
			arr[j] = in.nextInt();
		}
		return arr;
	}

	public static void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t > 0) {
			int input[] = takeInput();
			selectionSort(input);
			for(int i = 0; i < input.length; i++) {
				System.out.print(input[i] + " ");
			}
			t--;
		}

	}

}
