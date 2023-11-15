package algorithm;

import java.util.*;
/**
 * 크레인 인형뽑기(카카오)
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수 출력
 */
public class Level37 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = in.nextInt();
			}
		}
		int m = in.nextInt();
		int[] moves = new int[m];
		for (int i = 0; i < m; i++) {
			moves[i] = in.nextInt();
		}
		System.out.print(solution(board, moves));
	}
	
	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int x: moves) {
			for (int i =0; i<board.length; i++) {
				if (board[i][x-1]!=0) {
					int num = board[i][x-1];
					board[i][x-1]=0;
					if(!stack.isEmpty() && num == stack.peek()) {
						answer+=2;
						stack.pop();
					} else {
						stack.push(num);
					}
					break;
				}
			}
		}
		return answer;
	}
}
