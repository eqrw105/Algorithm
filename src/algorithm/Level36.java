package algorithm;

import java.util.*;
/**
 * 괄호문자제거
 * 입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력
 */
public class Level36 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr = in.next().toCharArray();
		System.out.print(solution(arr));
	}
	
	private static String solution(char[] arr) {
		String answer = "";
		Stack<Character> stack = new Stack();
		
		for (Character x: arr) {
			if (x == '(') {
				stack.add(x);
			} else if (x == ')' && !stack.isEmpty()) {
				stack.pop();
			} else if(stack.isEmpty()) {
				answer += x;
			}
		}

		return answer;
	}
}
