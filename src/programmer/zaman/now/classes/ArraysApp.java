package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {

	public static void main(String[] args) {
		
		int[] numbers = {
			1,43,312,3,123,1,3,43,24,4,12312,
		};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		//[1, 1, 3, 3, 4, 24, 43, 43, 123, 312, 12312]
		
		System.out.println(Arrays.binarySearch(numbers, 3));
		//Location index
		
		int[] numbers2 = Arrays.copyOf(numbers, 5);
		System.out.println(Arrays.toString(numbers2));
		//[1, 1, 3, 3, 4]
	}
	
}
