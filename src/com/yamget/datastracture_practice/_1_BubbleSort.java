package com.yamget.datastracture_practice;

public class _1_BubbleSort {

	public static void main(String[] args) {
		
		System.out.println(bubbleSort(new int[] {4,1,8,3}));
	}
	
	/* Look for the MAX value and put it at the end of the array
	 * =========================================================
	 *  Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
	 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
	 * Auxiliary Space: O(1)
	 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
	 * Sorting In Place: Yes
	 * Stable: Yes
	 */
	public static int[] bubbleSort(int[] value) {
				
		for(int i = 0; i < value.length-1; i++) {
			
			for(int j = 0; j < value.length-1-i; j++) {
				
				if(value[j] > value[j+1]) {					
					int temp = value[j];
					value[j] = value[j+1];
					value[j+1] = temp;
				}
			}
		}

		return value;
	}

}
