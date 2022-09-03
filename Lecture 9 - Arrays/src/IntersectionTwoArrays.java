import java.util.Scanner;

public class IntersectionTwoArrays {

	public static int[] takeInput() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];

		for (int j = 0; j < n; j++) {
			arr[j] = in.nextInt();
		}
		return arr;
	}

	public static void intersect(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					arr2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t > 0) {
			int input1[] = takeInput();
			int input2[] = takeInput();
			intersect(input1, input2);
			t--;
		}

	}

}
