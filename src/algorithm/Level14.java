package algorithm;

import java.util.Scanner;

/**
 * 보이는 학생
 * 학생의 키를 순서대로 주었을 때 앞에 서있는 사람보다 클 때만 보인다.
 * 선생님이 보이는 학생 수를 출력 
 */
public class Level14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.valueOf(in.next()); 
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print(solution(arr));
	
	}
	
	private static int solution(int[] arr) {
		int answer = 0;
		int num = -1;
		for (int i=0; i<arr.length; i++) {
			int newNum = arr[i];
			
			if (num < newNum) {
				answer++;
				num = newNum;
			}
		}
		
		return answer;
	}
}
