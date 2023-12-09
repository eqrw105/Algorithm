package algorithm;

import java.util.*;
/**
 * 뮤직비디오(결정알고리즘)
 * DVD에 총 N개의 곡 중에서 M개의 DVD에 동영상을 녹화할 때
 * DVD의 크기를 최소로 하려고 한다.
 * DVD의 최소 용량 크기를 출력
 * 첫 줄에 N, M이 주어진다.
 * 두 번째 줄에 곡의 길이가 분 단위로 주어진다.
 */
public class Level52 {

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
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			int mid = (rt+lt)/2;
			if (count(arr, mid)<=m) {
				answer = mid;
				rt = mid -1;
			} else {
				lt = mid +1;
			}
		}
		return answer;
	}
	
	private static int count(int[] arr, int capacity) {
		int cnt = 1;
		int sum = 0;
		for (int x: arr) {
			if (sum+x > capacity) {
				sum = x;
				cnt++;
			} else {
				sum += x;
			}
		}
		return cnt;
	}
}
