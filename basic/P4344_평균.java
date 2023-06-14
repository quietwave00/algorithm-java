package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4344_평균 {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	int count = 0;

	for (int i = 0; i < T; i++) {
	    StringTokenizer stk = new StringTokenizer(br.readLine());
	    count = Integer.parseInt(stk.nextToken());
	    int[] scoreArray = new int[count];
	    for (int j = 0; j < count; j++) {
		scoreArray[j] = Integer.parseInt(stk.nextToken());
	    }

	    // 평균 구하기
	    int sum = 0;
		for (int value : scoreArray) {
			sum += value;
		}
	    double avg = (double) sum / scoreArray.length;

	    // 평균 넘는 사람 명수 구하기
	    int check = 0;
		for (int j : scoreArray) {
			if (j > avg) {
				check++;
			}
		}
	    System.out.println(String.format("%.3f", (double) check / count * 100) + "%");

	}

	br.close();
    }

}
