package basics.day_7;

import java.util.Arrays;

public class programmers_181857 {

    /*
         문제 설명: 프로그래머스 181857 + 배열의 길이를 2의 거듭제곱으로 만들기
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution2(arr)));
    }

    // 배열 길이 확인하고, 새로운 배열 만들어주는 방법
    public static int[] solution(int[] arr) {
        int len = arr.length;
        int newLen = 0;

        for (int i = 1; i <= 10; i++) {
            double num = Math.pow(2, i);
            if (len <= num) {
                newLen = (int) num;
                break;
            }
        }
        int newArrLen = arr.length + newLen - len;
        int[] newArr = new int[newArrLen];

        for (int i = 0; i < newArrLen; i++) {
            if (i < len) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = 0;
            }
        }

        return newArr;
    }

    public static int[] solution2(int[] arr) {
        int length = 1;

        // 입력 배열의 길이보다 큰 가장 가까운 2의 제곱수를 찾기 위한 루프
        while (length < arr.length) {
            length *= 2;
        }

        // 원래 배열을 length 길이만큼의 배열로 복사 (남는 공간은 0으로 채워짐)
        return Arrays.copyOf(arr, length);
    }
}
