package algorithm;

import java.util.Scanner;

/**
 * 등수구하기
 * 각 학생의 등수를 입력된 순서대로 출력
 * 같은 점수 일 경우 높은 등수로 동일 처리
 * ex) 92점 3명 = 1등 3명, 다음은 4등
 */
public class Level20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(solution(n, arr));
	}
	
	private static int solution(int n, int[][] arr) {
		int maxSum = 0;
		int crossStart = 0;
		int crossEnd = 0;
		
		for (int i = 0; i < n ; i++) {
			crossStart += arr[i][i];
			crossEnd += arr[i][n-i-1];
			
			int rowSum = 0;
			int columnSum = 0;
			for (int j = 0; j < n; j++) {
				rowSum += arr[i][j];
				columnSum += arr[j][i];
			}
			maxSum = Math.max(maxSum, rowSum);
			maxSum = Math.max(maxSum, columnSum);
		}
		
		maxSum = Math.max(maxSum, crossStart);
		maxSum = Math.max(maxSum, crossEnd);
		
		return maxSum;
	}
}
