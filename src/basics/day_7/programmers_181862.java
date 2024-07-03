package basics.day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_181862 {
    /*
       문제 설명: 프로그래머스 181862 + 세 개의 구분자
     */

    public static void main(String[] args) {
        String myStr = "abcabcabcabc";
        System.out.println(solution(myStr));
        System.out.println(Arrays.toString(solution2(myStr)));
        myStr = "baconlettucetomato";
        System.out.println(solution(myStr));
        System.out.println(Arrays.toString(solution2(myStr)));

    }

    public static List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");

        String[] list = myStr.split(" ");

        for (String l : list) {
            if (!l.isEmpty()) { // equals("") 대신 isEmpty() 사용
                answer.add(l);
            }
        }

        if (answer.isEmpty()) { // size() 대신 isEmpty() 사용
            answer.add("EMPTY");
        }

        return answer;
    }

    public static String[] solution2(String myStr) {
        // 하나 이상의 a, b, 또는 c로 구성된 문자열을 ','로 대체
        myStr = myStr.replaceAll("[abc]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.isEmpty() ? "EMPTY" : myStr;

        return myStr.split(",");
    }
}
