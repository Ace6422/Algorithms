package club.mtuopensource.algorithms.sort;

/**
 * SelectionSort.java
 * Last Date Modified: April 5th, 2018
 * MTU Open Source Club
 * @author Javen Zamojcin
 */
public class SelectionSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public void sort(E[] array) {
		
		if ( array.length == 0 ) throw new IllegalArgumentException("array is empty");
		array = selectionSort(array);
		
	}

	/**
	 * Performs a selection sort and returns a sorted array in ascending order
	 * Time Complexity: O(n^2)
	 * @param array of comparable objects
	 * @return sorted array
	 */
	private E[] selectionSort(E[] array) {
		
		for ( int i = 0; i < array.length; i++ ) {
			
			int minIndex = i;
			for ( int j = i + 1; j < array.length; j++ ) {
				
				if ( array[j].compareTo(array[minIndex]) < 0 ) {
					minIndex = j;
				}
			}
			
			E temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
}
