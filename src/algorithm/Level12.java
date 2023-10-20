package algorithm;

import java.util.Scanner;

/**
 * 암호
 * # 또는 *이 일곱 개로 구성된 문자열을 2진수로 바꾸고 다시 10진수화 하여 아스키번호대로 문자로 변경하여 출력
 * # = 1, * = 0
 * ex) #*****# -> 1000001 -> 65 -> 'A'
 */
public class Level12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = Integer.valueOf(in.next()); 
		String str = in.next();
		System.out.print(solution(count, str));
	
	}
	
//	private static String solution(int count, String str) {
//		String answer = "";
//		str = str.replace('#', '1').replace('*', '0') + " ";
//		int range = (str.length() - 1) / count;
//		int temp = 0;
//		StringBuilder tempString = new StringBuilder();
//
//		for (int i = 0; i < str.length(); i++) {
//			if (temp == range) {
//				temp = 0;
//				char[] numArr = tempString.reverse().toString().toCharArray();
//				int result = 0;
//				// 2진수 -> 10진수
//				for (int j = 0; j < numArr.length; j++) {
//					result += Character.getNumericValue(numArr[j]) * (int)Math.pow(2, j);
//				}
//			
//				answer += Character.valueOf((char) result);
//				tempString.delete(0, tempString.length());
//			}
//			temp ++;
//			int num = Character.getNumericValue(str.charAt(i));
//			tempString.append(num);
//		}
//		
//		return answer;
//	}
	
	private static String solution(int n, String str) {
		String answer = "";
		str = str.replace("#", "1").replace("*", "0");
		int range = str.length() / n;
		for (int i=0; i<n; i++) {
			String tmp = str.substring(0, range);
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			str = str.substring(range);
		}
		
		return answer;
	}
}
