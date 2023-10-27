package algorithm;

import java.util.Scanner;

/**
 * 점수계산
 * 1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
 * 또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다.
 * 틀린 문제는 0점으로 계산한다.
 * ex) 1 0 1 1 1 0 0 1 1 0 -> 1 0 1 2 3 0 0 1 2 0 -> 10점
 */
public class Level19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(solution(arr));
	}
	
	private static int solution(int[] arr) {
		int answer = 0;
		int bonus = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer += ++bonus;
			} else {
				bonus = 0;
			}
		}
		
		
		return answer;
	}
}
