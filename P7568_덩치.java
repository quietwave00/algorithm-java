package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568_덩치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2]; //키, 몸무게
		
		//입력
		for(int i = 0; i < N; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(stk.nextToken());
			int height = Integer.parseInt(stk.nextToken());
			arr[i][0] = weight;
			arr[i][1] = height;
		}
		
		//연산
		for(int i = 0; i < N; i++) {
			int rank = 1;
			for(int j = 0; j < N; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { //i가 비교한 j보다 더 작음
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
		
		
	}

}
