package stringsandparsing;

public class GetSecondSmallest {
	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	static void printValue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		System.out.println("second smallest : " + arr[1]);

	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 8, 3, 4, 6, 5 };
		bubbleSort(arr);
		printValue(arr);

	}

}
