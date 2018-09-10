package Sorting;

public class QuickSort {
	static int arr[] = { 100, 20, 15, 30, 5, 75, 40, 110, 200, 150 };
	
	public static void main(String[] args) {
		System.out.println("Array before sorting:");
		printArray(arr,0,arr.length-1);

		System.out.println("-----------------------------");
		quickSort(arr, 0,arr.length-1);
 
		// Print array after sorting
		System.out.println("Array After sorting:");
		printArray(arr,0,arr.length-1);
	}
	
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if ( low < high ) {
			int mid = low + (high - low) / 2;
			int pivot = arr[mid];
			int i = low, j = high;
			
			while (i < j) {
				while (arr[i] < pivot) {
					i++;
				}
				while (arr[j] > pivot) {
					j--;
				}
				if (i <= j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}
			if (low < j) quickSort(arr, low, j);
			if (high > i) quickSort(arr, i, high);
		}
	}
}
