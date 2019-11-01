package com.yamget.datastracture_practice;

public class _2_SelectionSort {

	public static void main(String[] args) {
		
		System.out.println(selectionSort(new int[] {64, 25, 12, 22, 11}));
	}
	
	/* Looking for MIN value and put it at the beginning of the outer loop index
	 * =========================================================================
	 * Time Complexity: O(n2) as there are two nested loops.
	 * Auxiliary Space: O(1)
	 * 		The good thing about selection sort is it never makes more than O(n) swaps and 
	 * 		can be useful when memory write is a costly operation.
	 * Stability: The default implementation is not stable. However it can be made stable.
	 * In Place : Yes, it does not require extra space.
	 */
	public static int[] selectionSort(int[] value) {
		
		for(int i = 0; i < value.length; i++) {
			
			int min = i;
			
			for(int j = i+1; j < value.length; j++) {
				
				if(value[j] < value[min]) {
					min = j;
				}
			}
			
			int temp = value[i];
			value[i] = value[min];
			value[min] = temp;
		}
		
		return value;
	}

}
