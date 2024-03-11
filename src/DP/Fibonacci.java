package DP;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요 : ");
        
        int n = scanner.nextInt();
        
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(n);
        
        System.out.println("결과는 " + result + "입니다.");
        
        scanner.close();
    }
    public int fib (int n) {
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
