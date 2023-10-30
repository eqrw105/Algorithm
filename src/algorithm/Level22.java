package algorithm;

import java.util.Scanner;

/**
 * 임시반장 정하기
 * n명 학생일 때 1학년부터 5학년까지 같은 반이었던 사람이 가장 많은 학생 출력
 * 여러명인 경우에는 그 중 가장 작은 번호 출력
 */
public class Level22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.print(solution(n, arr));
	}
	
	private static int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
				
				if (max < count) {
					answer = i;
					max = count;
				
				}
			}
		}
		
		return answer+1;
	}
}
