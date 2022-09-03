import java.util.Scanner;

public class LinearSearch {

	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

	public static int linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			int check = arr[i];
			if (check == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {
			int arr[] = takeInput();
			int x = in.nextInt();
			int index = linearSearch(arr, x);

			System.out.println(index);
			t--;
		}

	}

}
