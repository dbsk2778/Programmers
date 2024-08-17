package sort.in_book.level_1;

import java.util.*;
public class programmers12917 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
        System.out.println(solution2("Zbcdefg"));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    // sb.reverse() 사용
    public static String solution2(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        // char[] 배열은 바로 new String(char 배열) 으로 String 으로 변환할 수 있음 !!
        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }

    public static String solution3(String str) {
        // 입력받은 문자열 s를 chars() 메서드를 사용하여 IntStream으로 변환 가능
        // boxed() 메서드 사용해서 Stream<Integer>로 변환
        return str.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                // collect() 메서드 사용법 아래 참조
                // 다시 문자열로 반환, StringBuilder로 Stream에 포함된 모든 문자를 이어 붙여 문자열로 반환
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, // 정수형이 아닌 문자 형식으로 들어가게 하기 위함
                        StringBuilder::append)
                .toString();


        // Stream에 StringBuilder를 사용하는 가장 간단한 방법은 collect() 메서드 사용
        // collect() 메서드는 Stream의 모든 원소를 하나의 객체로 통합하는 메서드
        // collect(supplier, accumulator, combiner)
        // 1. supplier : 반환할 객체 생성하는 함수
        // 2. accumulator : 반환할 객체에 stream의 어떤 원소를 어떻게 누적할지 정의하는 함수
        // 3. combiner : 반환할 객체가 여러 개 있을 때 어떻게 합치는지 정의하는 함수
    }
}
