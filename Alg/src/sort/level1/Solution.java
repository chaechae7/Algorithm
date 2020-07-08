package sort.level1;

public class Solution {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		System.out.println(solution(array, commands));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;

        int v = 0;
        
        for(int n=0; n<commands.length; n++) {
        	
        	i = commands[n][0];
        	j = commands[n][1];
        	k = commands[n][2];
        	
        	
        }
        
        
        
        
        
        
        return answer;
    }

}
