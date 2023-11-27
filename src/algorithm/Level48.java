package algorithm;

import java.util.*;
/**
 * 중복 확인
 * N명의 학생이 1부터 10,000,000까지 자연수 중에서 각자 좋아하는 숫자 하나를 적었을 때 중복된 숫자가 존재하면 D 아니면 U 출력
 */
public class Level48 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    HashSet<Integer> set = new HashSet<>();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      int num = in.nextInt();
	      arr[i] = num;
	      set.add(num);
	    }
	    System.out.println(arr.length == set.size() ? "U" : "D");
	}
}
