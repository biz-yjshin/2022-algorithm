/**
 *  번호: 15652
 *  날짜: 2022.10.25
 *  분류: 백트레킹
 *  제목: N과 M(4)
 *  링크: https://www.acmicpc.net/problem/15652
 * 
*/

import java.util.Scanner;
 
class NandM4 {
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		N = in.nextInt();
		M = in.nextInt();
 
		arr = new int[M];
        
		dfs(0);
		System.out.print(sb);
	}
 
	public static void dfs(int depth) {
		// 깊이가 M이랑 같아지면 출력 후 return
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			if(depth == 0 || arr[depth - 1] <= i) {
				arr[depth] = i;
				dfs(depth + 1);
			}
		}
	} 
}