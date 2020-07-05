import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
//		String roNumber="I";
//		String roNumber="II";
//		String roNumber="III";
//		String roNumber="IV";
		String roNumber="VI";
//		String roNumber="IX";
//		String roNumber="IXX";//표기법에 어긋나는 수
		

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
		
		int normal_num = 0;
		
		for(int i=0; i<roNumber.length(); i++) {
			
//			if(i == 0) {
//				result += roma.get(roNumber.charAt(i));
//			}
			
			if(i==0 || roma.get(roNumber.charAt(i)) == 1 && roma.get(roNumber.charAt(i))<=roma.get(roNumber.charAt(i-1))) {
				//1. 로마자가 한자리일 때 
				//2. 앞\뒤 비교시 I가 앞에 있지 않은 경우
				normal_num += roma.get(roNumber.charAt(i));
				
				
			}else {
				//1. I가 앞에 있는 경우
				
				//ex IV=4 / IX=5
				//ex IXX = 19
				normal_num += roma.get(roNumber.charAt(i)) - (2*roma.get(roNumber.charAt(i-1)));
				
			}
		}
	
		return normal_num;
		
	}
	
}