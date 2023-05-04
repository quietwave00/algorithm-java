package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738_행렬덧셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int[][] arr = new int[N][M];
		for(int i = 0; i < N; i++) {
			stk = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		for(int i = 0; i < N; i++) {
			stk = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				int b = arr[i][j] + Integer.parseInt(stk.nextToken());
				out.append(b).append(" ");
			}
			out.append("\n");
		}
		System.out.println(out);
		
	}

}
