package basics.day_2;

import java.util.Arrays;

public class programmers_181867 {

    // x 사이의 개수
    public static void main(String[] args) {
        splitTest();
        System.out.println(Arrays.toString(solution("axbxc")));
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution2("axbxc")));
        System.out.println(Arrays.toString(solution2("oxooxoxxox")));

        System.out.println(replaceTest("ABABABABAB", "ABAB"));

        System.out.println(replaceAllTest("abcdevwxyz"));
        System.out.println(replaceAllTest("jjnnllkkmm"));
    }

    public static void splitTest() {
        // split 메서드에 -1 인자를 넣으면 빈 문자열도 포함해서 배열에 담아줌 !!
        String[] parts = "axbxc".split("x", -1);
        System.out.println(Arrays.toString(parts));
    }

    public static int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        return answer;
    }

    public static int[] solution2(String myString) {
        return Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray();
    }

    /*
      181864 문자열 바꿔서 찾기
      문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어질 때,
      myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return
     */
    public static int replaceTest(String myString, String pat) {
        // replace를 여러번 붙여서 사용 가능
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }

    /*
      181834 l로 만들기
     */
    public static String replaceAllTest(String myString) {
    /*
      String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 'l') {
                answer += "l";
            } else answer += myString.charAt(i);
        }
        return answer;

        위 코드를 replaceAll로 간단하게 표현 가능
        * l-z가 아닌 문자를 l로 바꾸기 (l 이전에 오는 문자를 l로 바꾸기)
        * myString.replaceAll("[a-l]", "l"); // a-l 사이의 문자를 l로 바꾸기
     */
        return myString.replaceAll("[^l-z]", "l");
    }
}
