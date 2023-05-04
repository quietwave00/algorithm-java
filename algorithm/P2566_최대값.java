package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566_최대값 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[10][10];
		int max = 0;
		int line = 0;
		int row = 0;
		
		for(int i = 1; i <= 9; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			for(int j = 1; j <= 9; j++) {
				arr[i][j] = Integer.parseInt(stk.nextToken());
				if(arr[i][j] >= max) {
					max = arr[i][j];
					line = i;
					row = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(line + " " + row);
		
	}

}
