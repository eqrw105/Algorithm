package algorithm;

import java.util.*;
/**
 * 응급실
 * 대기목록에서 꺼낸 환자보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 넣는다.
 * M번째 환자는 몇 번째로 진료 받는지 출력
 */
public class Level42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Queue<Map.Entry<Integer,Integer>> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.offer(new AbstractMap.SimpleEntry<>(i, in.nextInt()));
		}
		System.out.print(solution(n, m, queue));
	}
	
	private static int solution(int n, int m, Queue<Map.Entry<Integer, Integer>> queue) {
		int answer = 0;
		while(!queue.isEmpty()) {
			Map.Entry<Integer, Integer> entry = queue.poll();
			if (isOver(entry.getValue(), queue)) {
				queue.offer(entry);
			} else {
				answer++;
				if (entry.getKey() == m) {
					break;
				}
			}
		}
		return answer;
	}
	
	private static boolean isOver(int num, Queue<Map.Entry<Integer, Integer>> queue) {
		Iterator<Map.Entry<Integer, Integer>> iterator = queue.iterator();
		while(iterator.hasNext()) {
			if (num  < iterator.next().getValue()) {
				return true;
			}
		}
		return false;
	}
}
