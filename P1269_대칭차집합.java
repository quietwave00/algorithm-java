package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1269_대칭차집합 {
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		stk = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());
		
		int[] AArr = new int[A];
		int[] BArr = new int[B];
		stk = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i++) {
			AArr[i] = Integer.parseInt(stk.nextToken());
		}
		stk = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++) {
			BArr[i] = Integer.parseInt(stk.nextToken());
		}
		Arrays.sort(AArr);
		Arrays.sort(BArr);
		
		//연산
		int result = 0;
		for(int i = 0; i < A; i++) { //A에 key
			result = search(BArr, AArr[i], 0, BArr.length - 1);
		}
		System.out.println(result);
		
		br.close();
	}
	
	static int search(int[] arr, int key, int low, int high) {
		int mid = 0;
		int count = 0;
		while(low <= high) {
			mid = (low + high) / 2;
			if(key == arr[mid]) {
				count++;
			} else if(key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return count;
	}

}
