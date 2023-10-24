package algorithm;

import java.util.Scanner;

/**
 * 소수 (에라토스테네스 체)
 * 1과 자기 자신을 약수로 가지는 소수의 개수를 출력
 * ex) n = 20 -> 8 
 */
public class Level17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		System.out.println(solution(n));
	}
	
//	private static int solution(int n) {
//		int answer = 0;
//		int[] arr = new int[n+1];
//		boolean[] bools = new boolean[n+1];
//		for (int i = 2; i <= n; i++) {
//			arr[i] = i;
//			bools[i] = true;
//		}
//		
//		for (int i = 2; i*i <= n; i++) {
//			if (!bools[i]) {
//				continue;
//			}
//			
//			for (int j = i * i; j <= n; j+= i) {
//				bools[j] = false;
//			}
//		}
//		for (int i = 2; i < bools.length; i++) {
//			if (bools[i]) {
//				answer++;
//			}
//		}
//		
//		return answer;
//	}
	
	private static int solution(int n) {
		int answer = 0;
		
		int[] arr = new int[n+1];
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i; j <= n; j += i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}
}
