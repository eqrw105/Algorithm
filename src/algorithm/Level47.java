package algorithm;

import java.util.*;
/**
 * Least Recently Used (코드 개선)
 * 캐시크기 S, 작업 개수 N이 입력 됨
 * 해야할 작업이 캐시에 없는 상태로 새로운 작업이 CPU를 사용한다면 모든 작업이 뒤로 밀리고 5번 작업은 캐시 맨 앞에 위치함
 * 해야할 작업이 캐시에 있는 상태로 새로운 작업이 CPU를 사용한다면 해당 작업 앞에있는 작업은 한칸씩 뒤로 밀리고 새로운 작업이 가장 앞에 위치함
 */
public class Level47 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int x : solution(s, n, arr)) {
			System.out.print(x + " ");	
		}
	}
	
	private static int[] solution(int s, int n, int[] arr) {
		int[] cache = new int[s];
		for (int num : arr) {
			int pos = -1;
			for (int j = 0; j < s; j++) {
				if (num == cache[j]) {
					pos = j;
				}
			}
			if (pos!=-1) {
				for (int q = pos; q > 0; q--) {
					cache[q] = cache[q-1];
				}
				cache[0] = num;
			} else {
				for (int q = s-1; q > 0; q--) {
					cache[q] = cache[q-1];
				}
				cache[0] = num;
			}
		}
			
		
		return cache;
	}
}
