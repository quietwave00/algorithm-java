package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2480_주사위세개 {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer stk = new StringTokenizer(br.readLine());

	int a = Integer.parseInt(stk.nextToken());
	int b = Integer.parseInt(stk.nextToken());
	int c = Integer.parseInt(stk.nextToken());

	int max = a;
	if (b > max) {
	    max = b;
	}
	if (c > max) {
	    max = c;
	}

	if (a == b && b == c) {
	    System.out.println(10000 + a * 1000);
	} else if (a == b && b != c) {
	    System.out.println(1000 + a * 100);
	} else if (b == c && c != a) {
	    System.out.println(1000 + b * 100);
	} else if (c == a && a != b) {
	    System.out.println(1000 + c * 100);
	} else {
	    System.out.println(max * 100);
	}

	br.close();
    }

}
