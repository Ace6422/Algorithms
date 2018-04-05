package club.mtuopensource.algorithms.test.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.*;
import club.mtuopensource.algorithms.sort.BubbleSort;

public class BubbleSortTest {

	BubbleSort<Integer> test;
	
	@Before
	public void setup() {
		
		test = new BubbleSort<>();
		
	}
	
	@Test
	public void test1() {
		
		Integer[] data = {1, 6, 4, 3, 7, 9, 8, 5, 2};
		Integer[] expectedData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void test2() {
		
		Integer[] data = {7, 7, 3, 5, 3, 6, 1, 1, 8};
		Integer[] expectedData = {1, 1, 3, 3, 5, 6, 7, 7, 8};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void test3() {
		
		Integer[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		Integer[] expectedData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		test.sort(data);
		assertArrayEquals(data, expectedData);
	}
	
	@Test
	public void test4() {
		
		Integer[] data = new Integer[1000];
		Integer[] expectedData = new Integer[1000];
		
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
