import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String roNumber="I";
//		String roNumber="II";
//		String roNumber="III";
//		String roNumber="IV";
//		String roNumber="VI";
//		String roNumber="IX";
//		String roNumber="XVI";
//		String roNumber="XXVI";
//		String roNumber2="XX";
//		String roNumber="IXX";//표기법에 어긋나는 수
		

		System.out.print("첫번째 수를 입력하세요 : ");
		String conroma1 = sc.next().toUpperCase();
		System.out.print("사칙연산자를 입력하세요 : ");
		String cal = sc.next();
		System.out.print("두번째 수를 입력하세요 : ");
		String conroma2 = sc.next().toUpperCase();
		
		int num1 = convertRoma(conroma1);
		int num2 = convertRoma(conroma2);
		
		Calculator(num1, num2, cal);
		
	}
		
	private static void Calculator(int num1, int num2, String cal) {
		
		String result = "";
		
		switch (cal) {
		case "+":
				if(1>num1+num2 && num1+num2<39)
					System.out.println("범위를 벗어났습니다.");
				else
					result = toRoma(num1+num2);
			break;
		case "*":
				if(1>num1+num2 && num1+num2<39)
					System.out.println("범위를 벗어났습니다.");
				else
					result = toRoma(num1*num2);
			
			break;
		case "/":
				if(num1<num2) {
					System.out.println("작은 수를 큰수로 나눌 수 없습니다.");
				}
				else {
					result = toRoma(num1/num2);
					result = toRoma(num1%num2);
				}
			
			break;
	
			
		}
		
		System.out.println(result);
		
		
	}

	private static String toRoma(int integer) {
		
		String[] RomaArr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"}; //46
		
		String toroma = "";
		
		
		return toroma;
		
	}

	private static int convertRoma(String roNumber) {
		
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
			
			
			if(i==0 || roma.get(roNumber.charAt(i)) == 1 || roma.get(roNumber.charAt(i))<=roma.get(roNumber.charAt(i-1))) {
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