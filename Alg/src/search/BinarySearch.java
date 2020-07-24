package search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("검색할 데이터를 입력하세요.");
		
		int search = sc.nextInt();
		
		binarySearch(dataArray, search);
		
		
	}

	private static void binarySearch(int[] dataArray, int search) {
		int mid;
		int left = 0;
		int right = dataArray.length-1;
		
		while(right >= left) {
			
			mid = (right + left) / 2;
			
			if(search == dataArray[mid]) {
				System.out.println(search+"값은 배열의"+mid+"번쨰 값 입니다.");
				
				break;
			}
			
			if(search < dataArray[mid]) {
				
				right = mid - 1;
				
			}else {
				
				left = mid + 1;
			}
			
		}
		
		
	}

}
