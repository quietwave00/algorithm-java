package org.example.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		Stack<Integer> stack = new Stack<>();
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		
		//입력
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		int num = 1; //비교할 자연수
		boolean result = true;
		
		//4 3 6 8 7 5 2 1
		//1 2 3 (num=5, sequnce = 3)
		//+ + + + - - 
		
		
		//연산
		for(int i = 0; i < size; i++) {
			int sequnce = arr[i]; //수열의 현재 값
			if(sequnce >= num) { //sequnce = 4 -> num = 1, 2, 3, 4까지, num = 5인 상태
				while(sequnce >= num) {
					stack.push(num++); //num = 5
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			} else { 
				int pop = stack.pop();
				if(pop > num) { //pop을 할 수 없는 상태. pop한 값이 자연수랑 비교 시 작을 때. 왜? 자연수가 쌓인 값보다 수열 수가 작으니까 pop을 할 수가 없
					System.out.println("NO");
					result = false;
					break;
				} else { //?
					bf.append("-\n");
				}
			} 
					
		}
		if(result) {
			System.out.println(bf.toString());
		}
	}

}
