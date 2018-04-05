package club.mtuopensource.algorithms.sort;

/**
 * InsertionSort.java
 * Last Date Modified: April 5th, 2018
 * MTU Open Source Club
 * @author Javen Zamojcin
 */
public class InsertionSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public void sort(E[] array) {
		
		if ( array.length == 0 ) throw new IllegalArgumentException("array is empty");
		array = insertionSort(array);
		
	}
	
	/**
	 * Performs an insertion sort and returns a sorted array in ascending order
	 * Time Complexity: O(n^2)
	 * @param array of comparable objects
	 * @return sorted array
	 */
	private E[] insertionSort(E[] array) {
		
		for ( int i = 1; i < array.length; i++ ) {
			
			E current = array[i];
			int j = i - 1;
			
			while ( j >= 0 && array[j].compareTo(current) > 0 ) {
				array[j + 1] = array[j];
				j--;	
			}
			
			array[j + 1] = current;
		}
		
		return array;
	}
}
