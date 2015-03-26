import java.util.*;

public class Lab8_5 {
	// Rearranges the elements of a into sorted order using
	// the selection sort algorithm.
	public static void selectionSort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N - 1; i++) {
			// find index of smallest remaining value
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			// swap smallest value its proper place, a[i]
					swap(a, i, min);
			System.out.println( "Pass "+(i+1) + " : "+ Arrays.toString(a));

		}
	}

	// Write a modified version of selection sort that selects both
	// the largest and smallest element each time and move them to
	// the appropriate end of the array
	public static void dualSelectionSort(int[] a) {
		int N = a.length-1;
		for (int i = 0; i <= N/2; i++) {
			// find index of smallest remaining value
			int min = i;
			int max = N-i;
			for (int j = i+1; j <= N-i; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				else if (a[j] > a[max]){
					max = j;
				}
			}
			// swap smallest value its proper place, a[i]
			swap(a, i, min);
			swap(a, N-i, max);
			System.out.println( "Pass "+(i+1) + " : "+ Arrays.toString(a));

		}


	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] data1 = {29, 17, 3, 94, 46, 8, -4, 12} ;
		selectionSort(data1);

		System.out.println("========================================");
		int[] data2 = {29, 17, 3, 94, 46, 8, -4, 12} ;
		System.out.println(Arrays.toString(data2));
		dualSelectionSort(data2);
		
		System.out.println("========================================");
		int[] data3 = {1, 17, 3, 94, 46, 8, -4, 12} ;
		System.out.println(Arrays.toString(data3));
		dualSelectionSort(data3);
	}
}
