package arrays.basic;

import java.util.Arrays;

public class split_array {
    public static void main(String[] args) {
        String myString = "abcxdefxghixjklxmnoxpqr";
        String myString2 = "abcxdefxghixjklxmnoxpqrx";
        System.out.println(Arrays.toString(solution(myString)));
        System.out.println(Arrays.toString(solution(myString2)));

    }

    public static int[] solution(String myString) {
        // split 메서드의 두 번째 인수는 분할된 문자열의 최대 개수를 지정합니다.
        // 이 값이 음수인 경우, 입력 문자열의 모든 가능한 분할을 수행하게 됩니다. (결국 마지막 값이 x일 경우, 뒷 부분도 처리 가능)
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String a : arr) {
            answer[idx++] = a.length();
        }
        return answer;
    }
}
