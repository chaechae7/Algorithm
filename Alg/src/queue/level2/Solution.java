package queue.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {

	private int weight;
	private int distance;

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int [] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}



	
	 public static int solution(int bridge_length, int weight, int[] truck_weights) {
		 int answer = 0;
			

			// 기다리고있는 버스
			Queue<Integer> waitTruck = new LinkedList<Integer>();

			// 이동중인 버스
			List<Truck> workingTruck = new ArrayList<Truck>();

			// 트럭의 무게를 모두 넣어줌. 
			for ( int truck : truck_weights ) {
				waitTruck.add(truck);
			}

			// 이동한 시간.
			int time = 0;

			// 다리위에있는 총 무게
			int totalWeight = waitTruck.peek();
			
			// 첫번째 트럭은 넣어주기 working에
			
			workingTruck.add(new Truck(waitTruck.poll(),0)); // 0번지에 w=7 index=0

			// 운행중 트럭이 모두 없어질때까지 반복
			while ( !workingTruck.isEmpty() ) {
				System.out.println("*******************************");
				System.out.println("소요시간 : "+time++); // 0 1 2 3 4
				System.out.println("*******************************");
				// 이동중인 버스가 있으면 모두 한칸 씩 이동시켜준다.
				for ( int i = 0 ; i < workingTruck.size(); i++ ) {
//					workingTruck.get(i).index++;
					System.out.println("=====첫번째====");
					System.out.println("이동중인 트럭 : "+workingTruck.size()); // 1 1 1 1 1
					System.out.println("이동 : "+workingTruck.get(i).index++); // 0 1 2 3 0

				}

				// 도착한 트럭이있으면 빼준다.
				// 끝까지 갔으면 working에서 제외시켜준다.
				if ( workingTruck.get(0).index > bridge_length ) {
					System.out.println("완료? : "+workingTruck.get(0).index); // 3
					System.out.println("=====두번째====");
					totalWeight -= workingTruck.get(0).weight ; // 35-7
					
					System.out.println("이동완료시 제거 : "+workingTruck.remove(0).weight); // 7
				}

				// 더 올릴 수 있는경우에는 대기에서 빼주고 working에 넣어준다.
				if ( !waitTruck.isEmpty() && totalWeight+waitTruck.peek() <= weight ) {
					System.out.println("=====세번째====");
					int nextTruck = waitTruck.poll();
					totalWeight += nextTruck;
					workingTruck.add(new Truck(nextTruck,1));
				}
			}

			answer = time ;

			return answer;
		}
		
		static class Truck{
			int weight = 0;
			int index = 0 ;
			
			public Truck ( int weight , int index ) {
				this.weight = weight;
				this.index = index;
			}
		}//Truck
}
