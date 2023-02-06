package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815_숫자카드 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cardArr = new int[N];
		String card = br.readLine();
		StringTokenizer cardStk = new StringTokenizer(card);
		for(int i = 0; i < N; i++) {
			cardArr[i] = Integer.parseInt(cardStk.nextToken());
		}
		int M = Integer.parseInt(br.readLine());
		int[] numArr = new int[M];
		String num = br.readLine();
		StringTokenizer numStk = new StringTokenizer(num);
		for(int i = 0; i < M; i++) {
			numArr[i] = Integer.parseInt(numStk.nextToken());
		}
		
//이중포문 시간초과
//		for(int i = 0; i < M; i++) {
//			int check = 0;
//			for(int j = 0; j < N; j++) {
//				if(numArr[i] == cardArr[j]) {
//					check++;
//				}
//			}
//			System.out.print(check + " ");
//		}
		
		Arrays.sort(cardArr);
		
		int result = 0;
		for(int i = 0; i < M; i++) {
			result = binarySearch(cardArr, numArr[i], 0, cardArr.length - 1);
			if(result != -1) {
				System.out.print("1" + " ");
			} else {
				System.out.print("0" + " ");
			}
		}
		br.close();
		
	}
	static int binarySearch(int[] cardArr, int key, int low, int high) {
//		System.out.println("cardArr: " + Arrays.toString(cardArr));
		int mid = 0;
		while(low <= high) { //low가 high 넘어서면 종료
			mid = (low + high) / 2;
			if(mid >= cardArr.length) {
				return -1;
			} else {
				if(key == cardArr[mid]) { 
					return mid;
	 			} else if(key < cardArr[mid]) {
	 				high = mid - 1; //앞쪽에잇
	 			} else {
	 				low = mid + 1; //뒤쪽에 있ㅇ므
	 			}
			}
			
		}
		return -1; //일치하는수없음
	}
}
