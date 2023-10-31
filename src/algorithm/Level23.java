package algorithm;

import java.util.Scanner;

/**
 * 멘토링
 * N명의 학생의 M번의 수학테스트 결과가 주어졌을 때, A학생이 멘토, B학생이 멘티가 되려면 A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야한다.
 * 멘토 멘티가 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력
 * 여러명인 경우에는 그 중 가장 작은 번호 출력
 */
public class Level23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(solution(n, m, arr));
	}
	
	private static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					continue;
				}
				int cnt = 0;
				for (int k = 0; k < m; k++) {
					int pi = 0, pj = 0;
					for (int s = 0; s < n; s++) {
						if (arr[k][s] == i) {
							pi = s;
						}
						if (arr[k][s] == j) {
							pj = s;
						}
					}
					if (pi < pj) {
						cnt++;
					}
				}
				if (cnt == m) {
					answer++;
				}
				
			}
		}
		
		return answer;
	}
}
