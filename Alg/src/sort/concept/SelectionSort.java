package sort.concept;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] array = {12, 326, 127, 467, 110, 58};
		int size=6;
		array = SelectionSort(array, size);
		System.out.println(Arrays.toString(array));
	}

	private static int[] SelectionSort(int[] array, int size) {
		int i, j ;
		int min, temp;
		
		for(i=0; i<array.length-1; i++) { //어떤 공간에 수를 넣을건지 지정
			min = i;

			for(j=i+1; j<array.length; j++) { // 해당 공간에 있는 임의의 값보다 작은 값이 있다면 값을 변경 

				if(array[j]<array[min]) min = j;
			}
			//값을 옮기는 작업
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			
		}		
		
		return array;
	}

}
