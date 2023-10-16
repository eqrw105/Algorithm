package algorithm;

import java.util.Scanner;

/**
 * 문장 속 단어
 * 문장의 단어들 중 가장 길이가 긴 단어를 출력
 */
public class Level3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.print(solution(str));
	}
	
	private static String solution(String str) {
		String answer = "";
		String[] strs = str.split(" ");
		
		for (String x : strs) {
			if (answer.length() < x.length()) {
				answer = x;
			}
		}
		
		return answer;
	}

}
