package algorithm;

import java.util.Scanner;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 출력
 * ex) 32 -> 23(소수), 910 -> 19(소수)
 */
public class Level18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			System.out.print(solution(num));
		}
	}
	
//	private static String solution(int num) {
//		String answer = "";
//		
//		String reverseNumString = new StringBuilder(String.valueOf(num)).reverse().toString();
//		int reverseNum = Integer.parseInt(reverseNumString);
//		int[] arr = new int[reverseNum + 1];
//		for (int i = 2; i <= reverseNum; i++) {
//			if (i == reverseNum && arr[i] == 0) {
//				answer = reverseNum + " ";
//				break;
//			}
//			
//			if (arr[i] == 0) {
//				for(int j = i; j <= reverseNum; j += i) {
//					arr[j] = 1;
//				}
//			}
//		}
//		
//		return answer;
//	}
	
	private static String solution(int num) {
		String reverseNumString = new StringBuilder(String.valueOf(num)).reverse().toString();
		int reverseNum = Integer.parseInt(reverseNumString);
		
		if (reverseNum <= 1) {
			return "";
		}
		
		for (int i = 2; i < reverseNum; i++) {
			if (reverseNum % i == 0) {
				return "";
			}
		}
		
		return reverseNum + " ";
	}
}
