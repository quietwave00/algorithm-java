package org.example.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206_너의평점은 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    double sum = 0;
    double grade = 0;
    double sumCredit = 0;
    for (int i = 0; i < 20; i++) {
        StringTokenizer stk = new StringTokenizer(br.readLine());
        String subject = stk.nextToken();
        double credit = Double.parseDouble(stk.nextToken());
        String gradeStr = stk.nextToken();

        switch (gradeStr) {
            case "A+":
                grade = 4.5;
                break;
            case "A0":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B0":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C0":
                grade = 2.0;
                break;
            case "D+":
                grade = 1.5;
                break;
            case "D0":
                grade = 1.0;
                break;
            case "F":
                grade = 0.0;
                break;
        }
        if (!"P".equals(gradeStr)) {
            sum += credit * grade;
            sumCredit += credit;
        }
    }
    br.close();
    System.out.println(sum / sumCredit);
    }
}
