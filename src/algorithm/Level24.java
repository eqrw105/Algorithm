package algorithm;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 두 배열 합치기
 * 오름차순으로 정렬된 두 배열을 오른차순으로 합쳐서 출력
 */
public class Level24 {

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
	
//	private static String solution(int[] arr1, int[] arr2) {
//		String answer = "";
//		
//		int arr1Index = 0;
//		int arr2Index = 0;
//		
//		for (int i = 0; i < arr1.length + arr2.length; i++) {
//			
//			if (arr2Index >= arr2.length) {
//				answer += arr1[arr1Index] + " ";
//				arr1Index++;
//				continue;
//			}
//			
//			if (arr1Index >= arr1.length) {
//				answer += arr2[arr2Index] + " ";
//				arr2Index++;
//				continue;
//			}
//			
//			if (arr1[arr1Index] <= arr2[arr2Index]) {
//				answer += arr1[arr1Index] + " ";
//				arr1Index++;
//			} else {
//				answer += arr2[arr2Index] + " ";
//				arr2Index++;
//			}
//		}
//		
//		return answer;
//	}
	
	private static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < arr1.length && p2 < arr2.length) {
			if (arr1[p1] < arr2[p2]) {
				answer.add(arr1[p1++]);
			} else {
				answer.add(arr2[p2++]);
			}
		}
		
		while(p1 < arr1.length) {
			answer.add(arr1[p1++]);
		}
		
		while(p2 < arr2.length) {
			answer.add(arr2[p2++]);
		}
		
		return answer;
	}
}
