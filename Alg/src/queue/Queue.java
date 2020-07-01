package queue;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		
		//선입선출의 구조
		//배열과 연결리스트로 구현 가능
		LinkedList<String> ls = new LinkedList<>();
		
		ls.offer("첫번째");
		ls.offer("두번째");
		ls.offer("세번째");
		ls.offer("네번째");
		
		System.out.println("Size = " + ls.size());
		
		while(ls.peek() != null) { // list에 들어있는 값이 null이 아니라면 계속 위에서부터 반환한다.
			
			System.out.println(ls.poll()); // 값을 읽어서 출력해준다.
			
			System.out.println("curr Size = " + ls.size()); // 현재 사이즈
		}
		
	}

}
