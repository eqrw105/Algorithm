package algorithm;

import java.util.*;
/**
 * 후위연산식
 * 후위연산식 연산 결과 출력
 */
public class Level38 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.print(solution(input));
	}
	
	private static int solution(String input) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char x: input.toCharArray()) {
			if (Character.isDigit(x)) {
				stack.push(Integer.parseInt(x+""));
				continue;
			} else {
				int num2 = Integer.parseInt(stack.pop().toString());
				int num1 = Integer.parseInt(stack.pop().toString());
				if (x == '+') {
					stack.push(num1+num2);
				} else if (x == '-') {
					stack.push(num1-num2);
				} else if (x == '*') {
					stack.push(num1*num2);
				} else if (x == '/') {
					stack.push(num1/num2);
				}
			}
		}
		answer = stack.pop();
		return answer;
	}
}
