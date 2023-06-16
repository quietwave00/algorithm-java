package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReP1316_그룹단어체커 {

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(checkGroupWord(str)) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean checkGroupWord(String str) {
		boolean[] checkArray = new boolean[26];
		char preStr = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(preStr != c) {
				if(!checkArray[c - 'a']) {
					checkArray[c - 'a'] = true;
					preStr = c;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}

}
