package algorithm;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 모든 아나그램 찾기
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 출력
 */
public class Level33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t = in.nextLine();
		System.out.print(solution(s, t));
	}
	
	private static int solution(String s, String t) {
		int answer = 0;
		
		char[] arr = s.toCharArray();
		char[] tArr = t.toCharArray();
		HashMap<Character, Integer> tMap = new HashMap<>();
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < t.length(); i ++) {
			if (i < t.length() - 1) {
				map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
			tMap.put(tArr[i], tMap.getOrDefault(tArr[i], 0) + 1);
		}
		int lt = 0;
		for (int rt = t.length() - 1; rt < arr.length; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			if (map.equals(tMap)) answer++;
			map.put(arr[lt], map.get(arr[lt]) - 1);
			if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}
}
