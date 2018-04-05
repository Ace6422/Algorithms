package club.mtuopensource.algorithms.sort;

import java.util.Arrays;

/**
 * MergeSort.java
 * Date Last Modified: April 5th, 2018
 * MTU Open Source Club
 * @author Javen Zamojcin
 */
public class MergeSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public void sort(E[] array) {
		
		if (array.length == 0) throw new IllegalArgumentException("array is empty");
		array = mergeSort(array);
		
	}
	
	/**
	 * Divides an array into two sub-arrays, calls a merge sort and 
	 * returns an array in a sorted ascending order
	 * Cost: O(n log n)
	 * @param an array of comparable objects
	 * @return sorted array
	 */
	private E[] mergeSort(E[] array) {
		
		int size = array.length;
		if ( size < 2 ) return array;
		int mid = size / 2;
		
		E[] Array1 = Arrays.copyOfRange(array, 0, mid);
		E[] Array2 = Arrays.copyOfRange(array, mid, size);
		
		mergeSort(Array1);
		mergeSort(Array2);
		return merge(array, Array1, Array2);
		
	}
	
	/**
	 * Performs merge sort on sub-arrays, and then combines them into the original array
	 * @param original array
	 * @param Sub-array one
	 * @param Sub-array two
	 * @return sorted array
	 */
	private E[] merge(E[] Array, E[] Array1, E[] Array2) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int size1 = Array1.length;
		int size2 = Array2.length;
		
		while ( i < size1 && j < size2 ) {
			if ( Array1[i].compareTo(Array2[j]) < 0 ) {
				Array[k] = Array1[i];
				i++;
			} else {
				Array[k] = Array2[j];
				j++;
			}
			k++;
		}
		
		while ( i < size1 ) {
			Array[k] = Array1[i];
			i++;
			k++;	
		}
		
		while ( j < size2 ) {
			Array[k] = Array2[j];
			j++;
			k++;
		}
		
		return Array;
	}
}
