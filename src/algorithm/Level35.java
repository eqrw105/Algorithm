package algorithm;

import java.util.*;
/**
 * 올바른 괄호
 * 괄호가 올바르면 YES 아니면 NO 출력
 */
public class Level35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.next().toCharArray();
		System.out.print(solution(arr));
	}
	
	private static String solution(char[] arr) {
		String answer = "NO";
		Stack<Character> stack = new Stack();
		
		for (Character x: arr) {
			if (x == '(') {
				stack.add(x);
			}
			if (x == ')') {
				if (stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			answer = "YES";
		}

		return answer;
	}
}
