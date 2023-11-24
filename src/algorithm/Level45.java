package algorithm;

import java.util.*;
/**
 * 삽입정렬
 */
public class Level45 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int x: solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
	
	private static int[] solution(int n, int[] arr) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			for (int j = i; j > 0; j--) {
				if (key < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = key;
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
		
		return arr;
	}
}
