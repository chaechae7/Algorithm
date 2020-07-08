package sort.concept;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {3, 53, 20, 18, 10, 9, 34, 15, 22};
		
		mergeSort(arr, 0, arr.length-1);
		
		printArray(arr);
		//정렬 전 : 3 53 20 18 10 9 34 15 22 
		//정렬 후 : 3 9 10 15 18 20 22 34 53 
	}

	private static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void mergeSort(int[] a, int left, int right) {
		//0번째 인덱스부터 끝에서-1 인덱스까지 계속해서 잘라준다.
		if(left < right) {
			
			int mid = (left+right)/2; //하나의 배열이 각각 1이 되도록(나눠질 수 없을때 까지) 나눈다.
			
			mergeSort(a, left, mid); // 왼쪽배열 나눔
			mergeSort(a, mid+1, right); // 오른쪽 배열 나눔
			merge(a, left, mid, right); // 잘게 쪼게진 배열을 다시 정렬하면서 합친다. 
		}
		
	}

	private static void merge(int[] a, int left, int mid, int right) {
		int i, j, k, l;
		i = left; // 왼쪽 인덱스를 관리
		j = mid+1; // 오른쪽 인덱스를 관리
		k = left; // 배열에 0번지부터 정렬된 수를 담음
//		l -> 복사를 위한 변수
		int []sorted = new int[a.length]; //정렬된 수를 담을 임의의 배열 
		
		//왼쪽인덱스와  오른쪽인덱스를 비교해 작은수를 0번지부터 차례대로 넣어준다.
		while(i<=mid && j<=right) {
			if(a[i]<a[j]) sorted[k++] = a[i++];
			else sorted[k++] = a[j++];			
		}
		
		//왼쪽인덱스를 다 넣고 오른쪽 인덱스가 남았다면,
		if(mid<i) {
			//오른쪽의 인덱스를 전부 삽입
			for(l=j; l<=right; l++) {
				sorted[k++] = a[l];
				
			}
			
		}else {
			//왼쪽의 인덱스를 전부 삽입
			for(l=i; l<=mid; l++) {
				sorted[k++] = a[l];
			}
			
		}
		
		//임의의 배열에 담긴 정렬된 값을 실제 배열로 옮김
		for(l=left; l<=right; l++) {
			
			a[l] = sorted[l];
		}
		
	}

}
