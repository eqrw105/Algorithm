package algorithm;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 아나그램(해쉬)
 * 두 문자열이 알파벳의 나열 순서는 다르지만 구성이 일치하면 아나그램이라고 한다.
 * 아나그램이면 YES 아니면 NO를 출력
 */
public class Level31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] first = in.nextLine().toCharArray();
		char[] second = in.nextLine().toCharArray();
		System.out.print(solution(first, second));
	}
	
	private static String solution(char[] first, char[] second) {
		String answer = "";
		HashMap<Character, Integer> firstMap = new HashMap<>();
		HashMap<Character, Integer> secondMap = new HashMap<>();
		for (int i = 0; i < first.length; i++) {
			firstMap.put(first[i], firstMap.getOrDefault(first[i], 0) + 1);
			secondMap.put(second[i], secondMap.getOrDefault(second[i], 0) + 1);
		}
		int num = 0;
		for (Character c : firstMap.keySet()) {
			if (firstMap.get(c) == secondMap.get(c)) num++;
		}
		answer = num == firstMap.size() ? "YES" : "NO";
		return answer;
	}
}
