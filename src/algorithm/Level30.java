package algorithm;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 학급 회장(해쉬)
 * A, B, C, D, E 후보 중 어떤 기호의 후보가 학급 회장이 되었는지 출력
 */
public class Level30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String k = in.next();
		System.out.print(solution(n, k));
	}
	
	private static char solution(int n, String k) {
		char answer = ' ';
		int num = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (char i : k.toCharArray()) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (char i : map.keySet()) {
			if (map.getOrDefault(i, 0) > num) {
				num = map.getOrDefault(i, 0);
				answer = i;
			}
		}
		return answer;
	}
}
