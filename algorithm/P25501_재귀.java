package org.example.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P25501_재귀 {
	static int count = 0;

	public static int recursion(String s, int l, int r){ //ABC, 0, 2
		count++;
        if(l >= r) return 1; //계속 호출되다가 여기서 걸리면 판별이 되는 거...
        else if(s.charAt(l) != s.charAt(r)) return 0; //A, C
        else return recursion(s, l+1, r-1); //ABC, 0, 2 / ABC, 2, 1
    }
    public static int isPalindrome(String s){ //ABC
    	int count = 0;
        return recursion(s, 0, s.length()-1); //ABC, 0, 2
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	String S = br.readLine();
        	count = 0;
        	int result = isPalindrome(S);
        	bw.write(result + " " + count + "\n");
        	
        }
        bw.flush();
        bw.close();
    }

}
