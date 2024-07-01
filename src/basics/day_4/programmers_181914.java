package basics.day_4;

import java.math.BigInteger;

public class programmers_181914 {
    // 181914 - 9로 나눈 나머지 구하기
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("78720646226947352489"));
    }

    // long을 넘어서는 큰 수를 다룰 때 BigInteger 사용
    public static int solution(String number) {
        BigInteger num = new BigInteger(number);
        return num.mod(BigInteger.valueOf(9)).intValue();
    }
}
