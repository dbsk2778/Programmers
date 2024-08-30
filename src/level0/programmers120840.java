package level0;

import java.math.BigInteger;

public class programmers120840 {

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
    }
    public static BigInteger solution(int balls, int share) {
        return getFactorial(balls).divide(getFactorial(balls - share).multiply(getFactorial(share)));
    }

    private static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
