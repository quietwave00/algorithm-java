//package org.example.programmers;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class P42577_전화번호목록 {
//    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        System.out.println(solution(phone_book));
//    }
//
//    static boolean solution(String[] phone_book) {
//        boolean result;
//        Arrays.sort(phone_book);
//        Map<String, String> map = new HashMap<>();
//        for(int i = 0; i < phone_book.length; i++) {
//            int length = phone_book[i].length();
//            for(int j = 1; j < phone_book.length; j++) {
//                phone_book[j].
//            }
//        }
//
//        return true;
//    }
//}

package org.example.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P42577_전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        //확인
        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) { //안에서
                if (map.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}

