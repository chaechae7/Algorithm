package stack;


public class Stack {

	public static void main(String[] args) {
		
	java.util.Stack<Integer> ex = new java.util.Stack<>();
	
	//Stack은 선입후출이다.
	//쉬운 예시로 쌓여있는 책을 빼낼 때 가장 늦게 쌓아올린 책을 먼저 빼야함.
	
	for(int i=0; i<10; i++) {
		ex.push(new Integer(i));
	}
		
		System.out.println("첫 번째 출력 : " + ex.pop());
		System.out.println("두 번째 출력 : " + ex.pop());
		System.out.println("세 번째 출력 : " + ex.pop());
		System.out.println("네 번째 출력 : " + ex.pop());
		System.out.println("다섯 번째 출력 : " + ex.pop());

		
		System.out.println("현재 위치 : " + ex.peek());
		
	//나만의 생각
	//그렇다면 스택의 구조에서 가장 먼저 들어간 것을 가장 먼저 빼 내려면 어떻게 해야하나?..
		
	}

}
