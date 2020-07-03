package sort.concept;

public class InsertSort {

	public static void main(String[] args) {
		int [] array = {12, 245, 23, 127, 467, 110, 58};
		
		for(int j = 1; j <array.length; j++) {
			
			int key = array[j];
			int i = j-1;
			
			while(i >=0 && array[i]>key) {
				
				array[i+1] = array[i];
				i = i-1;
				
			}
			array[i+1] = key;
			
		}
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
	}

}
