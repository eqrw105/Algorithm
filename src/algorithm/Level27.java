package algorithm;

import java.util.Scanner;
/**
 * 연속 부분수열
 * N개로 이루어진 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번인지 출력
 */
public class Level27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		
		System.out.print(solution(arr, n, m));
	}
	
	private static int solution(int[] arr, int n, int m) {
		int answer = 0;
		int sum = 0;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if (sum == m) {
				answer++;
			}
			while(sum >= m) {
				sum -= arr[idx++];
				if (sum == m) {
					answer++;
				}
			}
		}
		return answer;
	}
}
