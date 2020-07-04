import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String roNumber="IV";
		
		Calculator(roNumber);
		
		System.out.println(Calculator(roNumber));
		
	}
		
	private static int Calculator(String roNumber) {
		
		Map<Character, Integer> roma = new HashMap<>();
		
		roma.put('I', 1);
//		roma.put("II", 2);
//		roma.put("III", 3);
//		roma.put("IV", 4);
		roma.put('V', 5);
//		roma.put("VI", 6);
//		roma.put("VII", 7);
//		roma.put("VIII", 8);
//		roma.put("IX", 9);
		roma.put('X', 10);
		
		int result = 0;
		
		for(int i=0; i<roNumber.length()-1; i++) {
			
			if(roma.get(roNumber.charAt(i))== 1 && roma.get(roNumber.charAt(i))<roma.get(roNumber.charAt(i+1))) {
			
				result += roma.get(roNumber.charAt(i+1))-roma.get(roNumber.charAt(i));
				
			}else {
				
				result += roma.get(roNumber.charAt(i+1))+roma.get(roNumber.charAt(i));
				
			}
			
		}

		return result;
		
		
		
	}
	
}