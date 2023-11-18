package algorithm;

import java.util.*;
/**
 * 공주구하기
 * 1번 왕자부터 N번 왕자까지 번호를 외치고 외친 번호에 해당하는 왕자는 빠진다.
 * 최후에 남은 왕자가 공주를 구하러 갈 수 있을 때, 왕자의 번호 출력
 */
public class Level40 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.print(solution(n, k));
	}
	
	private static int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		while(queue.size() > 1) {
			for (int i = 1; i < k; i++) {
				queue.add(queue.poll());
			}
			queue.poll();
			
		}
		answer = queue.poll();

		return answer;
	}
}
