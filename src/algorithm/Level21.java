package algorithm;

import java.util.Scanner;

/**
 * 봉우리
 * N * N 격자판에서 자신의 상하좌우 숫자보다 큰 숫자는 봉우리이다.
 * 봉우리의 개수를 출력
 * 격자의 가장자리는 0으로 초기화 되었다고 가정
 */
public class Level21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n+2][n+2];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(solution(n, arr));
	}
	
//	private static int solution(int n, int[][] arr) {
//		int answer = 0;
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				int left = arr[i][j-1];
//				int right = arr[i][j+1];
//				int top = arr[i-1][j];
//				int bottom = arr[i+1][j];
//				int num = arr[i][j];
//				
//				if (num > left && num > right && num > top && num > bottom) {
//					answer++;
//				}
//			}
//		}
//		
//		return answer;
//	}
	
	private static int solution(int n, int[][] arr) {
		int answer = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, -1, 0, 1};
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				boolean flag = true;
				for (int k = 0; k < dx.length; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if (arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if (flag) answer++;
			}
		}
		
		return answer;
	}
}
