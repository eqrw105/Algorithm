package algorithm;

import java.util.*;
/**
 * 좌표 정렬
 * N개의 평면상의 좌표 x, y가 주어지면 모든 좌표를 오름차순으로 정렬하여 출력
 * x값의 의해서 정렬하고 x 값이 같을 경우 y값 의해 정렬
 */
class Point implements Comparable<Point> {
	public int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point o) {
		if (this.x==o.x) return this.y-o.y;
		else return x-o.x;
	}
}

public class Level50 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    Point[] arr = new Point[n];
	    for (int i = 0; i < n; i++) {
	    	arr[i] = new Point(in.nextInt(), in.nextInt());
	    }
	    for (Point o : solution(n, arr)) {
	    	System.out.println(o.x+" "+o.y);
	    }
	}
	
	private static Point[] solution(int n, Point[] arr) {
		Arrays.sort(arr);
		
		
		return arr;
	}
}
