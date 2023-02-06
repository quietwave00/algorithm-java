package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2231_분해합 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<String> numList = new ArrayList<>(); //각 자리수 쪼갠 수 들어갈 리스트
		int temp = 0;
		int result = 0;
		for(int i = 1; i <= N; i++) {
			temp = i; //1, 2, ..., 216
			numList = Arrays.asList(String.valueOf(i).split("")); //2, 1, 6
			
			for(int j = 1; j <= numList.size(); j++) { //3번 반복
				temp += Integer.parseInt(numList.get(j-1));
			}
			if(temp == N) {
				result = i;
				break;
			} 
		}
		
		System.out.println(result);
		
	}
}
