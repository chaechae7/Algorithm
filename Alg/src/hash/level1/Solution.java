package hash.level1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String[] participant = {"leo","kiki","edan"}; // 참가자
		String[] completion = {"edan", "kiki"}; // 완주자
		
		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";

        	Arrays.sort(participant);
        	Arrays.sort(completion);
        	
        	for(int i=0; i<3; i++) {
        		System.out.print(participant[i]+" ");
        	}
        	
        	System.out.println();
        	for(int i=0; i<2; i++) {
        		System.out.print(completion[i]+" ");
        		System.out.println();
        		System.out.println(participant[i]+"");
        	}
        
        for(int i=0; i<completion.length; i++) { //0,1 검사
        	if(!participant[i].equals(completion[i])) {
        		answer = participant[i];
        		
        		break;
        	}
        	
        }
        
        return answer;
    }

}
