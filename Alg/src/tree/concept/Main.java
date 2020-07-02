package tree.concept;

public class Main {
	//자료 추가, 조회
	public static void main(String[]args) {
		Tree TM = new Tree();
		System.out.println(8);
		TM.add(10, "A");
		TM.add(20, "B");
		TM.add(30, "C");
		TM.add(40, "D");
		
		System.out.println("===================검색1===================");
		
		Object temp = TM.get(20);
		System.out.println(temp);
		System.out.println("===================검색2===================");
		Object temp2 = TM.get(40);
		System.out.println(temp2);
	}
}
