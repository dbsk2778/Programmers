package brute_force.in_book.level_2;

import java.util.Arrays;

public class programmers42842 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        // yellow :  brown 가로 + 2/ 세로 + 2 / 네면이니까 -4를 해줘야 함
        // (가로) * 2 + (세로) * 2 - 4
        // 2가로 + 2세로 -4 2 * (가로 + 세로 - 2)
        // 2 : 3 + 3 + 4 + 4 - 4 = 10
        // 1 : 3 + 3 + 3 + 3 - 4 = 8
        // 24 : 6 + 8 + 6 + 8 - 4 = 12 + 16 -4 = 24

        int width = 0;
        int height = 0;
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int num = yellow / i;
                if (((num + 2) * 2) + ((i + 2) * 2) - 4 == brown) {
                    width = Math.max(i + 2, num + 2);
                    height = Math.min(i + 2, num + 2);
                    break;
                }
            }
        }
        return new int[]{width, height};
    }
}
