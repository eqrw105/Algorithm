package algorithm;

import java.util.Scanner;

/**
 * 가위 바위 보
 * 첫 줄에 게임 횟수
 * 두 번째 줄에 A가 낸 가위, 바위, 보 정보
 * 세 번째 줄에 B가 낸 가위, 바위, 보 정보
 * 1: 가위, 2: 바위, 3: 보
 * 각 회 승자를 출력, 비겼을 때는 D 출력 
 */
public class Level15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int[] userA = new int[n];
		int[] userB = new int[n];
		for (int i = 0; i < n; i++) {
			userA[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			userB[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(solution(userA[i], userB[i]));
		}
	
	}
	
//	private static String solution(int userA, int userB) {
//		if (userA == userB) {
//			return "D";
//		}
//		
//		//A가 보 일 때
//		if (userA == 3) {
//			//B가 바위 면
//			if (userB == 2) {
//				return "A";
//			} else {
//				return "B";
//			}
//			//A가 바위 일 때
//		} else if (userA == 2) {
//			//B가 가위 면 
//			if (userB == 1) {
//				return "A";
//			} else {
//				return "B";
//			}
//			//A가 가위 면
//		} else {
//			if (userB == 3) {
//				return "A";
//			} else {
//				return "B";
//			}
//		}
//	}
	
	private static String solution(int userA, int userB) {
		String answer = "";
		if (userA == userB) {
			answer = "D";
		} else if ((userA == 1 && userB == 3) ||
				(userA == 2 && userB == 1) ||
				(userA == 3 && userB == 2)) {
			answer = "A";
		} else {
			answer = "B";
		}
		return answer;
	}
}
