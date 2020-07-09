package sort.level1;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		
		System.out.println(solution(array, commands));
		System.out.println(Arrays.toString(solution(array, commands)));
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        int index=0;

        //해당하는 2차원 배열 i,j,k에 맞는 수를 임의의 배열에 담아 정렬시킨후 k번째 수를 뽑음
        //배열은 0번지부터 시작하는 것과 별개로 이 문제는 각 자리수를 인덱스로 봄
        for(int n=0; n<commands.length; n++) {
        	// 2차원배열에 속한 각 조건을 뽑아냄
        	i = commands[n][0]; //2
        	j = commands[n][1]; //5
        	k = commands[n][2]; //3
        		
        	int []temp = new int[j-i+1]; // end - start +1 => 잘라낸 배열의 크기 ex> 2번째 자리수부터 5번째 자리수까지 = 4

        	int v = 0; // 임의의 변수에 담기는 수와 인덱스는 지속적으로 변함
        		for(int l=i-1; l<j; l++) {

        			temp[v++] = array[l]; //잘라낸 배열을 임의의 배열에 넣어줌
        		}
        		
        		Arrays.sort(temp); // 배열을 정렬
        		answer[index++] = temp[k-1]; // 정렬한 배열에 있는 수 중 k번째 자리수를 answer에 담아줌
        		
        }
        return answer;
    }

}
