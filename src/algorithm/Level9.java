package algorithm;

import java.util.Scanner;

/**
 * 숫자만 추출
 * 문자와 숫자가 섞여있는 문자열에서 숫자만 추출하여 그대로 자연수를 만들어 출력
 */
public class Level9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
	}
	
	private static int solution(String str) {
		String answer = "";
		for(char s : str.toCharArray()) {
			if (Character.isDigit(s)) {
				answer += s;
			}
		}
		return Integer.parseInt(answer);
	}

}
