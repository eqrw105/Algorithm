package algorithm;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열을 알파벳만 뒤집어서 출력
 */
public class Level5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(solution(str));
	}
	
	private static String solution(String str) {
		char[] arr = str.toCharArray();
		int lt = 0;
		int rt = str.length()-1;
		
		while(lt<rt) {
			if (Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])) {
				char tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
			} else if (Character.isAlphabetic(arr[lt])) {
				lt--;
			} else if (Character.isAlphabetic(arr[rt])) {
				rt++;
			}
			lt++;
			rt--;
		}
		return String.valueOf(arr);
	}

}
