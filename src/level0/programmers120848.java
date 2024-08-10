package level0;

public class programmers120848 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution2(3628800));
    }

    static int[] arr = new int[12];

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < 12; i++) {
            arr[i] = factorial(i);

            if (arr[i - 1] <= n) {
                answer = i - 1;
            }

        }

        return answer;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        if (arr[n] != 0) return arr[n];

        int num = n * factorial(n - 1);
        arr[n] = num;
        return num;
    }

    public static int solution2(int n) {
        int answer = 1;
        int factorial = 1;

        while (n >= factorial) {
            answer++;
            factorial *= answer;
        }
        return answer - 1;
    }
}
