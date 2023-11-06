package algorithm;

import java.util.Scanner;
/**
 * 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 수열에서 최대 k번 0을 1로 변경할 수 있을 때, 길이가 가장 긴 연속부	분수열의 길이를 출력
 * ex) 11001101101101, k = 2 -> 110011111111 -> 8 출력
 */
public class Level29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(solution(n, k, arr));
	}
	
	private static int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = k;
		int lt = 0;
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0) {
				cnt--;
			}
			while(cnt < 0) {
				if(arr[lt] == 0) {
					cnt++;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		return answer;
	}
}
