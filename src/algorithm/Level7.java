package algorithm;

import java.util.Scanner;

/**
 * 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열이면 YES 아니면 NO 출력
 */
public class Level7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
	}
	
	private static String solution(String str) {
		char[] chars = str.toLowerCase().toCharArray();
		int lt = 0;
		int rt = chars.length-1;
		while(lt<rt) {
			if (chars[lt] != chars[rt]) {
				return "NO";
			}
			lt++;
			rt--;
		}
		
		return "YES";
	}

}
