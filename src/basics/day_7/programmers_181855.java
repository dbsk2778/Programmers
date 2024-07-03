package basics.day_7;

import java.util.HashMap;
import java.util.Map;

public class programmers_181855 {

    /*
         문제 설명: 프로그래머스 181855 + 문자열 묶기
     */

    public static void main(String[] args) {
        String[] strArr = {"a", "bc", "d", "efg", "hi"};
        System.out.println(solution(strArr));
        System.out.println(solution2(strArr));
    }

    public static int solution(String[] strArr) {
        int answer = 0;
        int[] lens = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            lens[i] = strArr[i].length();
        }

        Map<Integer, Integer> maps = new HashMap<>();

        for (int len : lens) {
            if (maps.containsKey(len)) {
                maps.put(len, maps.get(len) + 1);
            } else {
                maps.put(len, 1);
            }
        }

        for (int key : maps.keySet()) {
            if (answer < maps.get(key)) {
                answer = maps.get(key);
            }
        }

        return answer;
    }

    public static int solution2(String[] strArr) {
        int answer = 0;
        // 1 ≤ strArr의 원소의 길이 ≤ 30
        int[] lenArr = new int[31];

        for (String s : strArr) {
            lenArr[s.length()]++;
        }

        for (int i = 0; i <= 30; i++) {
            answer = Math.max(answer, lenArr[i]);
        }

        return answer;
    }
}
