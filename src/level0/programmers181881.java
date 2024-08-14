package level0;

import java.util.Arrays;

public class programmers181881 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int length = arr.length;
        int[] newArr = new int[length];
        boolean isSame = false;

        while (!isSame) {
            answer++;

            for (int i = 0; i < length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    newArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    newArr[i] = arr[i] * 2 + 1;
                } else {
                    newArr[i] = arr[i];
                }
            }

            boolean[] isSameArr = new boolean[length];

            for (int i = 0; i < length; i++) {
                if (arr[i] == newArr[i]) {
                    isSameArr[i] = true;
                } else {
                    arr[i] = newArr[i];
                    isSameArr[i] = false;
                }
            }

            isSame = true;

            for (int i = 0; i < length; i++) {
                if (!isSameArr[i]) {
                    isSame = false;
                    break;
                }
            }
        }

        return answer - 1;
    }

    public static int solution2(int[] arr) {
        int count = 0;
        while (true) {
            int[] copied = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < copied.length; i++) {
                if (copied[i] >= 50 && copied[i] % 2 == 0) {
                    copied[i] /= 2;
                } else if (copied[i] < 50 && copied[i] % 2 == 1) {
                    copied[i] = copied[i] * 2 + 1;
                }
            }

            // 배열이 동일한지 확인
            if (Arrays.equals(arr, copied)) {
                return count;
            }

            // 배열을 이렇게 바로 대입 가능
            arr = copied;
            count++;
        }
    }
}
