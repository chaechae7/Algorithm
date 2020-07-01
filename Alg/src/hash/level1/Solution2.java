package hash.level1;

import java.util.HashMap;

public class Solution2 {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","edan"}; // 참가자
		String[] completion = {"edan", "kiki"}; // 완주자
		
		System.out.println(solution(participant, completion));
	}
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String player : completion) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		for(String player : participant) {
			
			map.put(player, map.getOrDefault(player, 0)-1);
			
			if(map.get(player)<0)
				return player;
		}
		
		return answer;
	}

}
