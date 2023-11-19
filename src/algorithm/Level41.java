package algorithm;

import java.util.*;
/**
 * 교육과정 설계
 * 첫 줄에 필수과목의 순서가 주어질 때 두 번 째 줄에 현수가 짠 수업 설계가 주어진다.
 * 현수가 짠 수업 설계 순서 필수과목 순서를 지켰으면 YES 지키지 않았으면 NO 출력
 */
public class Level41 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		String k = in.next();
		System.out.print(solution(n, k));
	}
	
	private static String solution(String n, String k) {
		String answer = "";
		Queue<Character> queue = new LinkedList<>();
		Queue<Character> queue2 = new LinkedList<>();
		
		for(char x: k.toCharArray()) {
			queue2.add(x);
		}
		
		int cnt = 0;
		
		for(char x: n.toCharArray()) {
			while(!queue2.isEmpty()) {
				char s = queue2.poll();
				if (x == s) {
					cnt++;
					break;
				}
			}
		}
		
		answer = cnt == n.length() ? "YES" : "NO";
			

		return answer;
	}
}
