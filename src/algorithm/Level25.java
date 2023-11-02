package algorithm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 공통원소 구하기
 * 두 집합의 공통원소를 오름차순 정렬하여 출력
 */
public class Level25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = in.nextInt();
		}
		for (int x : solution(arr1, arr2)) {
			System.out.print(x + " ");	
		}
	}
	
	private static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
				p2++;
			} else if (arr1[p1] < arr2[p2]) {
				p1++;
			} else {
				p2++;
			}
		}
		
		return answer;
	}
}
