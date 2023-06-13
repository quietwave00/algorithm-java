package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988_팰린드롬 {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();

	char[] charArray = str.toCharArray();

	boolean result = true;
	int length = str.length();

	// level: 5
	for (int i = 0; i < length / 2; i++) {
	    if (charArray[i] != charArray[length - i - 1]) {
		result = false;
		break;
	    }
	}
	System.out.println(result ? "1" : "0");
    }
}
