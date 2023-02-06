package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773_제로 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stack.push(num);
			} else {
				if(!stack.empty()) {
					stack.pop();
				}
			}
		}
		
		int sum = 0;
		if(stack.empty()) {
			System.out.println("0");
		} else {
			for(int i = 0; i <= stack.size() + (i - 1); i++) {  
				sum += stack.pop();
			}
			System.out.println(sum);
		}
		
		
	}

}
