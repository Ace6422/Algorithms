package club.mtuopensource.algorithms.sort;

/**
 * BubbleSort.java
 * Date Last Modified: April 5th, 2018
 * MTU Open Source Club
 * @author Javen Zamojcin
 */
public class BubbleSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public void sort(E[] array) {
		
		if ( array.length == 0 ) throw new IllegalArgumentException("array is empty");
		array = bubbleSort(array);
		
	}
	
	/**
	 * Performs bubbleSort and returns a sorted array
	 * TimeComplexity: O(n^2)
	 * @param comparable array to be sorted.
	 * @return Sorted array in ascending order.
	 */
	private E[] bubbleSort( E[] array ) {
		
		int n = array.length;
		
		for ( int i = 0; i < n-1; i++ ) {
		
			for ( int j = 0; j < n-i-1; j++ ) {
				
				if ( array[j].compareTo(array[j + 1]) > 0 ) {
					E temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		return array;
	}
	
	/**
	 * Prints an array (sorted or unsorted)
	 * @param array to be printed
	 */
	public void printArray(E[] array) {
		
		for ( int i = 0; i < array.length; i++ ) {
			System.out.print(array[i] + " ");	
		}
		
		System.out.println();
	}
}
