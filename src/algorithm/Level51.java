package algorithm;

import java.util.*;
/**
 * 이분검색
 * N개의 수를 오름차순으로 정렬하고 이분검색으로 M이 몇 번째에 있는지 출력
 */
public class Level51 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	    	arr[i] = in.nextInt();
	    }
	    System.out.println(solution(n, m, arr));
	}
	
	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0;
		int rt = arr.length-1;
		while(lt<=rt) {
			int idx = (lt+rt)/2;
			
			if (arr[idx] == m) {
				answer = idx+1;
				break;
			}
			
			if (arr[idx] > m) {
				rt = idx - 1;
			} else {
				lt = idx + 1;
			}
		}
		return answer;
	}
}
