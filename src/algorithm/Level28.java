package algorithm;

import java.util.Scanner;
/**
 * 연속된 자연수의 합
 * N이 입력되면 2개 이상의 연속된 자연수의 함으로 정수 N을 표현하는 방법의 가짓수를 출력
 * ex) n = 15 -> 7+8 = 15 and 4+5+6 = 15 and 1+2+3+4+5 = 15 -> 3 출력
 */
public class Level28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.print(solution(n));
	}
	
	private static int solution(int n) {
		int answer = 0;
		int sum = 0;
		int lt = 1;
		for (int rt = 1; rt < n; rt++) {
			sum += rt;
			
			if (sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= lt++;
				if (sum == n) {
					answer++;
				}
			}
		}
		return answer;
	}
}
