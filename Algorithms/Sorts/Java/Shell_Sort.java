package pratice_coding;

public class Shell_Sort {
	int sort(int arr[]) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i += 1) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];
		         arr[j] = temp;
			}
		}
		return 0;
	}
	public static void main(String args[]) {
		int arr[] = { 12, 34, 54, 2, 3 };
		Shell_Sort shellSort = new Shell_Sort();
		shellSort.sort(arr);
		System.out.println("The array, after performing shell sort is : ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}
}
