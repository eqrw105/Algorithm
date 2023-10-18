package algorithm;

import java.util.Scanner;

/**
 * 유효한 팰린드롬
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열이면 YES 아니면 NO 출력
 * 단 알파벳만 가지고 검사하며 알파벳 이외의 문자는 무시
 */
public class Level8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(solution(str));
	}
	
	private static String solution(String str) {
//		char[] chars = str.toLowerCase().toCharArray();
//		int lt = 0;
//		int rt = chars.length-1;
//		while(lt<rt) {
//			if (!Character.isAlphabetic(chars[lt])) {
//				lt++;
//				continue;
//			}
//			
//			if (!Character.isAlphabetic(chars[rt])) {
//				rt--;
//				continue;
//			}
//			
//			if (chars[lt] != chars[rt]) {
//				return "NO";
//			}
//			lt++;
//			rt--;
//		}
		
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		String reverseStr = new StringBuilder(str).reverse().toString();
		if (str.equals(reverseStr)) {
			return "YES";
		}
		
		return "NO";
	}

}
