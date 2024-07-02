package basics.day_7;

public class programmers_181880 {

    /*
        문제 설명: 프로그래머스 181880 + 1로 만들기
     */

    public static void main(String[] args) {

    }

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int num: num_list) {
            while (num != 1) {
                // 이걸 if문으로 하는게 더 효율적인가? 삼항연산자로 하는게 더 효율적인가? 이런 코드에서는 별 차이 없지만 코드가 복잡해졌을 때 if문이 더 가독성있고 효율적일 수 있음
                // if (num % 2 == 0) {
                //    num = num / 2;
                // } else {
                // num = (num - 1) / 2;
                // }
                num = (num % 2 == 0) ? (num / 2) : ((num - 1) / 2);
                answer += 1;
            }
        }

        return answer;
    }
}
