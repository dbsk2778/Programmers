import dp.Fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int n = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(n);

        System.out.println("결과는 " + result + "입니다.");

        scanner.close();
    }
}