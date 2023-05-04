package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class P9012_괄호 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] arr = new String[T];
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < T; i++) {
			String data = br.readLine();
			arr[i] = data;
		}

		for(int i = 0; i < T; i++) {
			String str = arr[i];
			char[] ch = str.toCharArray();
			List<char[]> list = Arrays.asList(ch);
			System.out.println("( 개수: " + Collections.frequency(Arrays.asList(ch), '('));
			System.out.println(") 개수: " + Collections.frequency(Arrays.asList(ch), ')' ));
			if(Collections.frequency(Arrays.asList(ch), "(") % 2 == 0 && Collections.frequency(Arrays.asList(ch), ")") % 2 == 0) {
				System.out.println("YES");
			} else if(Collections.frequency(Arrays.asList(ch), "(") % 2 == 1 || Collections.frequency(Arrays.asList(ch), ")") % 2 == 1){
				System.out.println("NO");
			}
		}
		
		
		
	}

}
