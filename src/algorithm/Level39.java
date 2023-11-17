package algorithm;

import java.util.*;
/**
 * 쇠막대기
 * 한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어지면 잘려진 조각의 개수를 출력
 */
public class Level39 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.print(solution(input));
	}
	
	private static int solution(String input) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char x = input.charAt(i);
			if (x == '(') {
				stack.push(x);
			} else if (x == ')' && input.charAt(i-1) == '(') {
				//레이저
				stack.pop();
				answer+=stack.size();
			} else if (x == ')' && input.charAt(i-1) != '(') {
				//막대기 끝
				stack.pop();
				answer+=1;
			}
		}
		return answer;
	}
}
