package club.mtuopensource.algorithms.test.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import club.mtuopensource.algorithms.sort.HeapSort;

public class HeapSortTest {

HeapSort<Integer> test;
	
	@Before
	public void setup() {
		test = new HeapSort<>();
	}
	
	@Test
	public void Test1() {
		
		Integer[] data = {5, 6, 4, 2, 1, 3, 8, 9, 7};
		Integer[] expectedData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void Test2() {
		
		Integer[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] expectedData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void Test3() {
		
		Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Integer[] expectedData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void Test4() {
		
		Integer[] data = {5, 5, 4, 4, 2, 3, 8, 8, 7};
		Integer[] expectedData = {2, 3, 4, 4, 5, 5, 7, 8, 8};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void Test5() {
		
		Integer[] data = new Integer[2000];
		Integer[] expectedData = new Integer[2000];
		
		for ( int i = data.length - 1; i >= 0; i-- ) {
			data[i] = i;
		}
		
		for ( int i = 0; i < expectedData.length; i++ ) {
			expectedData[i] = i;
		}
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
}
