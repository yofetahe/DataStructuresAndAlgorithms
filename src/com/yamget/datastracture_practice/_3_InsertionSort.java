package com.yamget.datastracture_practice;

public class _3_InsertionSort {

	public static void main(String[] args) {
		
		System.out.println(insertionSort(new int[] {4,3,2,10,12,1,5,6}));
	}

	/* Look for MIN value of the two neighbors and backward comparison if condition satisfied
	 * ======================================================================================
	 * Time Complexity: O(n*2)
	 * Auxiliary Space: O(1)
	 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
	 * 				   And it takes minimum time (Order of n) when elements are already sorted.
	 * Algorithmic Paradigm: Incremental Approach
	 * Sorting In Place: Yes
	 * Stable: Yes
	 * Online: Yes
	 * 
	 * Uses: Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted, 
	 * 		 only few elements are misplaced in complete big array.
	 */
	public static int[] insertionSort(int[] value) {
		
		for(int i = 1; i < value.length; i++) {
			
			int j = i - 1;
			
			while(j >= 0 && value[j] > value[i]) {
				int temp = value[i];
				value[i] = value[j];
				value[j] = temp;
				j--;
				i--;
			}
		}
		
		return value;
	}
}
