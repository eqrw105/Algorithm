package algorithm;

import java.util.*;
/**
 * 응급실
 * 대기목록에서 꺼낸 환자보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 넣는다.
 * M번째 환자는 몇 번째로 진료 받는지 출력
 */
class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
public class Level42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Queue<Person> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, in.nextInt()));
		}
		System.out.print(solution(n, m, queue));
	}
	
	private static int solution(int n, int m, Queue<Person> queue) {
		int answer = 0;
		while(!queue.isEmpty()) {
			Person person = queue.poll();
			if (isOver(person.priority, queue)) {
				queue.offer(person);
			} else {
				answer++;
				if (person.id == m) {
					break;
				}
			}
		}
		return answer;
	}
	
	private static boolean isOver(int num, Queue<Person> queue) {
		Iterator<Person> iterator = queue.iterator();
		while(iterator.hasNext()) {
			if (num  < iterator.next().priority) {
				return true;
			}
		}
		return false;
	}
}
