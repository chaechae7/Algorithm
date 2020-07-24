package search;

import java.util.Scanner;

public class SequentialSerach {

	public static void main(String[] args) {
		int[]Array = {4, 21, 2, 10, 11, 16};
		
		System.out.println("검색할 데이터를 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int searchdata = sc.nextInt();
		
		int result = sequentialSerach(Array, searchdata);
		
		if(result == -1)
			System.out.println("찾으려고하는 데이터가 존재하지 않습니다.");
		else
			System.out.println("데이터의 위치는 "+result+"번째 입니다.");
		
		
	}

	private static int sequentialSerach(int[] array, int searchdata) {
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i] == searchdata)
				return i;
		 
		
		}
		return -1;
	}

}
