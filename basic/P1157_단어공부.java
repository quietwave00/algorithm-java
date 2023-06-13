package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P1157_단어공부 {

    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine().toLowerCase();
	String distinctStr = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());

	char[] array = str.toCharArray();
	char[] distinctArray = distinctStr.toCharArray();
	int[] checkArray = new int[distinctArray.length];

	for (char c : array) {
		for (int j = 0; j < distinctArray.length; j++) {
			if (c == distinctArray[j]) {
				checkArray[j] += 1;
			}
		}
	}

//	int duplicateValue = (int) Arrays.stream(checkArray).distinct().count();
	int max = 0;
	int maxIndex = 0;
	int checkArrayMax = Arrays.stream(checkArray).max().getAsInt();
	int count = 0;
	boolean hasDuplicates = false;

	outerLoop:
		for (int i = 0; i < checkArray.length; i++) {
	    if (checkArray[i] > max) {
			max = checkArray[i];
			maxIndex = i;
		}
			if(checkArray[i] == checkArrayMax) {
				count++;
				if(count > 1) {
					System.out.println("?");
					break outerLoop;
				}
			}
		}

		if(count <= 1) {
			System.out.println(Character.toUpperCase(distinctArray[maxIndex]));
		}

    }
}
