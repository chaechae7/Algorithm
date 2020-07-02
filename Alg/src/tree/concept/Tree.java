package tree.concept;

public class Tree {
	// 이진트리 생성, 자료 추가/조회
	TreeNode topNode = null;
	
	public void add(int key, Object value) {//2
		System.out.println(9);
		if(topNode == null) {
			System.out.println("ture");
			topNode=new TreeNode(key, value);			
		}
		else {
			System.out.println("false");
			topNode.add(key,value);
		}
		
	}
	
	public Object get(int key) {
		System.out.println(1);
		return topNode==null ? null:topNode.find(key);
	}
}
