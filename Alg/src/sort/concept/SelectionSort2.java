package sort.concept;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		
		int [] array = {12, 326, 127, 467, 110, 58};
		int size=6;
		array = SelectionSort(array, size);
		System.out.println(Arrays.toString(array));
	}

	private static int[] SelectionSort(int[] array, int size) {
		int min;
		int temp;
		for(int i=0; i<array.length-1; i++) {
			
			min = i;
			
			for(int j=i+1; j<array.length; j++) {
				if(array[min]>array[j]) min = j;
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		return array;
	}

}
