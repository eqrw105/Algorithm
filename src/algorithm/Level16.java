package algorithm;

import java.util.Scanner;

/**
 * 피보나치 수열
 * 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
 * ex) n = 7 -> 1 1 2 3 5 8 13 
 */
public class Level16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
	
		System.out.println(solution(n));
	
	}
	
	private static String solution(int n) {
		String answer = "";
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 2) {
				answer += 1 + " ";
				arr[i] = 1;
				continue;
			}
			
			int num = arr[i-1] + arr[i-2];
			answer += num + " ";
			arr[i] = num;
		}
		return answer;
	}
}
