package algorithm;

import java.util.Scanner;
/**
 * 최대 매출
 * N일 동안의 매출 기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 출력
 */
public class Level26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		
		System.out.print(solution(arr, k));
	}
	
	private static int solution(int[] arr, int k) {
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		answer = sum;
		for (int i = k; i < arr.length; i++) {
			sum += (arr[i]-arr[i-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
}
