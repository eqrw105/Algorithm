package algorithm;

import java.util.Scanner;

/**
 * 문자열 압축
 * 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하여 출력
 */
public class Level11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();

		System.out.print(solution(str));
	
	}

//	private static String solution(String str) {
//		String answer = "";
//		
//		int count = 0;
//		char lastChar = str.charAt(0);
//		answer += lastChar;
//		
//		for (int i = 0; i< str.length(); i++) {
//			char c = str.charAt(i);
//			
//			if (lastChar != c) {
//				if (count > 1) {
//					answer += String.valueOf(count);
//				}
//				count = 0;
//				answer += c;
//				lastChar = c;
//			}
//			count++;
//		
//		}
//		
//		if (count > 1) {
//			answer += String.valueOf(count);
//		}
//		
//		return answer;
//	}
	
	private static String solution(String str) {
		String answer = "";
		str = str + " ";
		
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			char next = str.charAt(i+1);
			if (c==next) {
				count++;
			} else {
				answer += c;
				if (count>1) {
					answer += String.valueOf(count);
					count=1;
				}
			}
		}
		
		return answer;
	}
}
