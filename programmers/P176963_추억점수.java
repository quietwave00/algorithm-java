package org.example.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P176963_추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                String photoName = photo[i][j];
                if (map.containsKey(photoName)) {
                    int yearningValue = map.get(photoName);
                    result[i] += yearningValue;
                }
            }
        }
        return result;
    }
}
