package Sorting;

public class MergeSort {
	static int arr[] = { 100, 20, 15, 30, 5, 75, 40, 110, 200, 150 };
	
	public static void main(String[] args) {
		System.out.println("Array before sorting:");
		printArray(arr,0,arr.length-1);

		System.out.println("-----------------------------");
		mergeSort(arr, 0,arr.length-1);
 
		// Print array after sorting
		System.out.println("Array After sorting:");
		printArray(arr,0,arr.length-1);
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int middle = l + (r - l) / 2;
			mergeSort(arr, l, middle);
			mergeSort(arr, (middle + 1), r);
			merge(arr, l, middle, r);
		}
	}
	
	public static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i=0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j=0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = l;
		
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
