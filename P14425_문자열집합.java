package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14425_문자열집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		String[] sArr = new String[N];
		String[] checkArr = new String[M];
		
		//입력
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			sArr[i] = s;
		}
		
		for(int i = 0; i < M; i++) {
			String check = br.readLine();
			checkArr[i] = check;
		}
		
		Arrays.sort(sArr);
		
		boolean result = false;
		int count = 0;
		//연산
		for(int i = 0; i < M; i++) {
			result = search(sArr, checkArr[i], 0, sArr.length-1);
			if(result) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	static boolean search(String[] sArr, String key, int low, int high) {
		int mid = 0;
		while(low <= high) { //low가 high 넘어서면 종료
			mid = (low + high) / 2;
//			System.out.println("mid: " + mid);
//			System.out.println("sArr[mid]: " + sArr[mid]);
//			System.out.println("key: " + key);
			if(key.equals(sArr[mid])) {
				return true;
			} else if(key.compareTo(sArr[mid]) < 0) { //앞에 있는 경우
				high = mid -1;
			} else { //뒤에 있는 경우
				low = mid + 1;
			}
		}
		return false;
	}

}
