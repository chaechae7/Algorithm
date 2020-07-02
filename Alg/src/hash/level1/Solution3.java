package hash.level1;

import java.util.HashMap;

public class Solution3 {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","edan"}; // 참가자
		String[] completion = {"edan", "kiki"}; // 완주자
		
		System.out.println(solution(participant, completion));
	}
	//HASH문제
	private static String solution(String[] participant, String[] completion) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//getOrDefault는 해당하는 키가 존재하고 value가 존재한다면 그대로 사용
		//기존의 put에 +1 / -1 해준다면 중복되는 key값을 새로운 값으로 변경함/ getOrDefault
		//해당하는 키가 존재하지 않는다면 Default value를  넣어줌
		for(String s : completion) { 
			map.put(s, map.getOrDefault(s, 0)+1);

		}
		for(String s : participant) {
			map.put(s, map.getOrDefault(s, 0)-1);

			if(map.get(s)<0) {//해당하는 키값이 가지고 있는 벨류가 <0 이라면, 리턴해준다.
				return s;
			}
		}
		
		
		return "";
	}

}
