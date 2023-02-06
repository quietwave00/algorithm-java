package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24060_재귀병합정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(stk.nextToken());
		int count = Integer.parseInt(stk.nextToken());
		
		int[] num = new int[size];
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(stk.nextToken());
			
		}
		
	}

}
