import java.util.Scanner;

public class BinarySearch {

	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < n; j++) {
			arr[j] = in.nextInt();
		}
		return arr;
	}

	public static int binarySearch(int arr[], int x) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				end = mid - 1;
			} else if (arr[mid] < x) {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input[] = takeInput();
		int t = in.nextInt();

		while (t > 0) {
			int x = in.nextInt();
			System.out.println(binarySearch(input, x));

			t--;
		}
	}

}
