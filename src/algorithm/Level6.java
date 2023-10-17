package algorithm;

import java.util.Scanner;

/**
 * 중복문자제거
 * 중복된 문자를 제거한 문자열 출력
 */
public class Level6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
	}
	
	private static String solution(String str) {
		String answer = "";
//		for (char x : str.toCharArray()) {
//			if (!answer.contains(Character.toString(x))) {
//				answer += x;
//			}
//		}
		
		for(int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer.toString();
	}

}
