package algorithm;

import java.util.Scanner;

/**
 * 단어 뒤집기
 * N개의 단어를 순서대로 하나씩 뒤집어서 출력
 */
public class Level4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		for (int i = 0; i < count; i++) {
			String str = in.next();
			System.out.println(solution(str));
		}
	}
	
	private static String solution(String str) {
		//String answer = "";
//		for (int i = str.length()-1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
		
		String answer = new StringBuilder(str).reverse().toString();
		
		return answer;
	}

}
