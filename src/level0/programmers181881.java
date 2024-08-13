package level0;

public class programmers181881 {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 100, 99, 98}));
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
}
