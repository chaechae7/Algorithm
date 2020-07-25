package search;

public class StringAlgoriyhm {

	public static void main(String[] args) {
		String str = "abcdabcdfgab";
		String sStr = "ab"; 
		
		int oriStrLen = str.length();
		int sStrLen = sStr.length();
		
		char[] allString = str.toCharArray();
		char[] searchString = sStr.toCharArray();
		
		int count = 0;
		
		for(int start=0; start<oriStrLen; start++) {
			for(int i=0; i<sStrLen; i++) {
				
				if(allString[start] == searchString[i]) {
					
					if(allString[start+1] == searchString[i+1]) {
						
						count++;
					}
				}
				else {
					
					break;
				}
				
			}
			
		}
		System.out.println("찾아진 문자의 개수 = "+count);
	}

}
