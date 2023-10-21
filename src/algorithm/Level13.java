package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 큰 수 출력하기
 * N 개 정수에서 바로 앞 수 보다 큰 수만 출력 
 */
public class Level13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.next()); 
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(solution(arr));
	
	}
	
	private static String solution(int[] arr) {
		String answer = "";
		int num = -1;
		for (int i=0; i<arr.length; i++) {
			int newNum = arr[i];
			
			if (num < newNum) {
				answer += newNum + " ";
			}
			num = newNum;
		}
		
		return answer;
	}
}
