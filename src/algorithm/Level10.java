package algorithm;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * 문자열과 문자가 주어졌을 때 문자열의 각 문자와 문자의 거리를 순서대로 출력
 */
public class Level10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char t = in.next().charAt(0);
		for (int x: solution(str, t)) {
			System.out.print(x + " ");		
		}
	
	}
	
//	private static String solution(String str, char t) {
//		String answer = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (t == str.charAt(i)) {
//				answer += 0 + " ";
//				continue;
//			}
//			
//			boolean isLeft = false;
//			int left = 0;
//			for(int j = i - 1; j >= 0; j--) {
//				left++;
//				if (t == str.charAt(j)) {
//					isLeft = true;
//					break;
//				}
//			}
//			
//			boolean isRight = false;
//			int right = 0;
//			for(int j = i + 1; j < str.length(); j++) {
//				right++;
//				if (t == str.charAt(j)) {
//					isRight = true;
//					break;
//				}
//			}
//			
//			if (isLeft && isRight) {
//				answer += Math.min(left, right) + " ";
//			} else if(isLeft) {
//				answer += left + " ";
//			} else if (isRight) {
//				answer += right + " ";
//			}
//		}
//		
//		return answer;
//	}

	private static int[] solution(String str, char t) {
		int[] answer = new int[str.length()];
		
		int p = 1000;
		for (int i = 0; i < str.length(); i++) {
			p++;
			if (t == str.charAt(i)) {
				p = 0;
			}
			answer[i] = p;
		}
		
		p = 1000;
		for (int i = str.length()-1; i >= 0; i--) {
			p++;
			if (t == str.charAt(i)) {
				p = 0;
			}
			
			if (p < answer[i]) {
				answer[i] = p;
			}
		}
		
		return answer;
	}
}
