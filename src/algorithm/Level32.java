package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 * 매출액의 종류
 * N일 간의 매출기록에서 K일간 구간의 매출 종류 수를 출력
 */
public class Level32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0 ; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for(Integer x : solution(n, k, arr)) {
			System.out.print(x + " ");	
		}
	}
	
	private static ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		int lt = 0;
		for (int rt = k - 1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}
}
