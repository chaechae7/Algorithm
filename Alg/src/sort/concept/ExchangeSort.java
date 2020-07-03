package sort.concept;

import java.util.Arrays;

public class ExchangeSort {

	public static void main(String[] args) {
		int [] array = {12, 36, 127, 226, 456, 56, 3};
		
		array = ExchangeSort(array);
		
		System.out.println(Arrays.toString(array));
	}

	private static int[] ExchangeSort(int[] array) {
		
		for(int i=0; i<array.length-1; i++) {
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i]>array[j]) {
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
		}
		
		return array;
	}

}
