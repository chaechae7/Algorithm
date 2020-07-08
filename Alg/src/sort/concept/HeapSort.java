package sort.concept;

public class HeapSort {

	public static void main(String[] args) {
		//임의의 10개의 수를 받을 수 있도록 선언
		int number = 10;
		int []data = new int[number];
		for(int i=0; i<number; i++) {
			data[i] = (int)(Math.random()*100);
		}
		//정렬 전의 숫자 숫자 배열 (힙구조를 배열로 구성할 수 있다.)
		System.out.print("정렬 전 : ");
		for(int i=0; i<number; i++) {
			System.out.print(data[i]+" ");
		}
		
		//완전이진트리를 활용한 힙구조 그 중에서도 최대힙으로 구성하는 메소드로 이동
		heap(data, number); 
		
		for(int i = number-1; i>0; i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			
			heap(data, i);
		}
		
		System.out.print("\n정렬 후 : ");
		for(int i=0; i<number; i++) {
			System.out.print(data[i]+" ");
		}
	}

	private static void heap(int[] data, int number) {
		// 힙 구조의 [0-1/0-2] / [1-3/1-4] / [2-5/2-6] 비교한다.
		//아래의 로직은 힙 구조를 구성함과 동시에 최대힙을 구현하는 로직
		for(int i=1; i<number; i++) {
			// ex -> 자식요소가 1,2번지의 값일 때, 부모는 0번지이다.
			int child = i;
			
			while(child>0) {
				// 자식으로부터 부모의 index를 구하는 것
				int parent = (child-1)/2;
				// 최대힙이 아닐 경우 변경해줌
				if(data[child] > data[parent]) {
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
					
				}
				child = parent; // 재귀해준다.
			}
		}
	}

}
