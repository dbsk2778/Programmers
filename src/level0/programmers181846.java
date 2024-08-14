package level0;

import java.math.BigInteger;

public class programmers181846 {
    public static void main(String[] args) {
        System.out.println(solution("8446744073709551615", "287346502836570928366"));
    }

    public static String solution(String a, String b) {
        BigInteger bigIntA = new BigInteger(a);
        BigInteger bigIntB = new BigInteger(b);

        BigInteger sum = bigIntA.add(bigIntB);

        return sum.toString();
        // return String.valueOf(sum);
    }

}
