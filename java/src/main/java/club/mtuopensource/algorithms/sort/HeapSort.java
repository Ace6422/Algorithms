package club.mtuopensource.algorithms.sort;

/**
 * HeapSort.java
 * Last Date Modified: April 6th, 2018
 * MTU Open Source Club
 * @author Javen Zamojcin
 */
public class HeapSort<E extends Comparable<E>> implements ISort<E> {

	@Override
	public void sort(E[] array) {
		
		if ( array.length == 0 ) throw new IllegalArgumentException("array is empty");
		array = heapSort(array);
		
	}

	/**
	 * Builds a heap from array, then moves the root index (largest value) to end of array
	 * @param array of comparable objects
	 * @return sorted array in ascending order
	 */
	private E[] heapSort(E[] array) {
		
		for ( int i = (array.length / 2) - 1; i >= 0; i-- ) {
			heapify(array, array.length, i);
		}
		
		for ( int i = array.length - 1; i >= 0; i-- ) {
			E temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array, i, 0);
		}
		
		return array;
	}
	
	/**
	 * Retains the heap property, keeping the largest value at root index
	 * @param array to be sorted
	 * @param size of array
	 * @param index of root
	 */
	private void heapify(E[] array, int size, int index) {
		
		int largest = index;
		int left = (index * 2) + 1;
		int right = (index * 2) + 2;
		
		if ( left < size && array[left].compareTo(array[largest]) > 0 ) {
			largest = left;
		}
		
		if ( right < size && array[right].compareTo(array[largest]) > 0 ) {
			largest = right;
		}

		if ( largest != index ) {
			E temp = array[index];
			array[index] = array[largest];
			array[largest] = temp;
			
			heapify(array, size, largest);
		}
	}
}
