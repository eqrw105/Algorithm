package algorithm;
import java.util.Scanner;

/**
 * 문자 찾기
 * 문자열에 특정 문자가 몇 개 있는지 출력
 */
public class Level1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input1 = in.next();
		char input2 = in.next().charAt(0);
		System.out.print(solution(input1, input2));

	}
	
	private static int solution(String str, char c) {
		int result = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == c) {
//				result++;
//			}
//		}
		
		for(char x : str.toCharArray()) {
			if (x == c) {
				result++;
			}
		}
		return result;
	}
}
