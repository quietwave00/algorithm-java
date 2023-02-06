package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872_팩토리얼 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long num = 1;
		//10 * 9 * 8 * ... * 1
//		for(int i = 0; i < N; i+=2) {
//			if(N == 1) {
//				num = 1;
//			} else {
//				num = num * (N - i) * (N-i-1);
//			}
//		}
//		System.out.println(num);
//		
//	}
		
		//재귀
		num = factorial(N);
		System.out.println(num);

	}
	
	private static int factorial(int N) {
		if(N <= 1) {
			return 1;
		} else {
			return N * factorial(N - 1);
		}
	}
}
