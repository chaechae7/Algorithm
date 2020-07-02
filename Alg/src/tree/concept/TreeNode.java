package tree.concept;

public class TreeNode {
	// 이진트리를 실질적으로 구성하는 클래스
	private int itsKey;// 10
	private Object itsValue;// A
	private TreeNode nodes[] = new TreeNode[2];
	
	public TreeNode(int key, Object value) {//루트노드가 10/A 노드1 20 B
		System.out.println(7);
		itsKey = key;
		itsValue = value;

			System.out.println("============start============");

	}
	
	public Object find(int key) {
		System.out.println(2);
		if(key == itsKey) {
			return itsValue;
		}
		
		return findSub(selectSubNode(key), key);
		
	}
	private int selectSubNode(int key) {
		System.out.println(3);
		return (key<itsKey) ? 0 : 1;
		
	}

	private Object findSub(int node, int key) {
		System.out.println(4);
		return nodes[node] == null ? null : nodes[node].find(key);
	}

	public void add(int key, Object value) {
		System.out.println(5);
		if(key == itsKey) {//20 == 10	// 30 == 20	
			System.out.println("T");
			itsValue = value;
		}
		else {
			System.out.println("F");
			SubNode(selectSubNode(key), key, value);// 1 20 B // 1 30 C 
		}
		
	} 

	private void SubNode(int node, int key, Object value) {
		System.out.println(6);
		if(nodes[node]==null) {
			System.out.println("T");
			System.out.println("노드["+node+"]");
			nodes[node]= new TreeNode(key, value);			
		}
		else {
			System.out.println("F");
			nodes[node].add(key, value);
		}
			
	}
	
	
	
}
