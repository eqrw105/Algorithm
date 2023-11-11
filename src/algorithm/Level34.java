package algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * K번째 큰 수
 * 1부터 100까지 적힌 N개의 카드 중 3장을 뽑아서 합한 값 중 K번째로 큰 수를 출력
 */
public class Level34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(solution(n, k, arr));
	}
	
	private static int solution(int n, int k, Integer[] arr) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for (int i = 0; i < n - 2; i++) {
			for (int j = i+1; j < n - 1; j++) {
				for (int q = j+1; q < n; q++) {
					int num = arr[i] + arr[j] + arr[q];
					set.add(num);
				}
			}
		}
		int cnt = 0;
		for(int x : set) {
			cnt++;
			if (cnt==k) return x;
		}

		return answer;
	}
}
