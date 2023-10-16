package algorithm;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 소문자는 대문자로, 대문자는 소문자로 변환하여 출력
 */
public class Level2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		System.out.print(solution(input));
	}
	
	private static String solution(String str) {
		String answer = "";
		
		for (char s : str.toCharArray()) {
			if (Character.isUpperCase(s)) {
				answer += Character.toLowerCase(s);
			} else {
				answer += Character.toUpperCase(s);
			}
		}
		return answer;
	}

}
