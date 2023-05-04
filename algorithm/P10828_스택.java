package org.example.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P10828_스택 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			if(str.contains("push")) {
				String[] arr = str.split(" ");
				int num = Integer.parseInt(arr[1]);
//				System.out.println("num: " + num);
				stack.push(num);
			} else if(str.equals("pop")) {
				if(!stack.empty()) {
					bw.write(stack.pop() + "\n");
				} else {
					bw.write("-1\n");
				}
			} else if(str.equals("size")) {
				bw.write(stack.size() + "\n");
			} else if(str.equals("empty")) {
				if(stack.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if(str.equals("top")) {
				if(stack.empty()) {
					bw.write("-1\n");
				} else {
					bw.write(stack.peek() + "\n");
				}
			}
		}
		bw.flush();
		bw.close();
		
		
	}

}
