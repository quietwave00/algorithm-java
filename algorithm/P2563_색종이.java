package org.example.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2563_색종이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[101][101];
		
		int result = 0;
		for(int i = 0; i < count; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(stk.nextToken());
			int y1 = Integer.parseInt(stk.nextToken());
			int x2 = x1 + 10;
			int y2 = y1 + 10;
			for(int j = x1; j < x2; j++) {
				for(int k = y1; k < y2; k++) {
					if(paper[j][k] == false) {
						paper[j][k] = true;
						result++;
						
					}
				}
			}
			
			
		}
		System.out.println(result);
		
	}

}
