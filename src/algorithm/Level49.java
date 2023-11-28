package algorithm;

import java.util.*;
/**
 * 장난꾸러기
 * 키순으로 서있는 반 한생들 중 철수와 짝궁이 자리를 바꿨다.
 * 철수의 순서와 짝궁의 순서를 차례대로 출력
 */
public class Level49 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	    	arr[i] = in.nextInt();
	    }
	    System.out.println(solution(n, arr));
	}
	
	private static String solution(int n, int[] arr) {
		String answer = "";
		int[] temp = arr.clone();
		Arrays.sort(temp);
		
		for (int i = 0 ; i < n; i++) {
			if (arr[i] != temp[i]) {
				answer += i+1 + " ";
			}
		}
		return answer;
	}
}
