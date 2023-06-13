package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304_영수증 {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int price = Integer.parseInt(br.readLine());
	int type = Integer.parseInt(br.readLine());
	int result = 0;
	for (int i = 0; i < type; i++) {
	    StringTokenizer stk = new StringTokenizer(br.readLine());
	    int a = Integer.parseInt(stk.nextToken());
	    int b = Integer.parseInt(stk.nextToken());
	    result += a * b;
	}

	if (price == result) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }

}
