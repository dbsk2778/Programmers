package sort.in_book.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class comparator {

    // 내림차순 정렬이나 클래스 정렬 등 오름차순 이외의 다양한 정렬 기준으로 정렬하기위해
    // Comparator<T>를 사용할 수 있음
    // Comparator<T>는 int compare(T o1, T o2)의 메서드를 가진 자바의 제네릭 인터페이스 = 제네릭 타입의 T를 받아 비교함
    // 이 비교 결과를 정수로 반환하는데, 0이면 두 객체가 같은 것, 양수이면 왼쪽 객체가 더 큼, 음수이면 오른쪽 객체가 더 큼
    public static void main(String[] args) {
        intExample();
        stringExample();
    }

    // int형 정렬
    public static void intExample() {
        // 정렬 메서드들은 아래와 같이 하나의 추가 매개 변수를 받을 수 있음
        // Arrays.sort(Comparator<T> c), Collections.sort(Comparator<T> c), stream.sorted(Comparator<T> c)

        // 내림차순 정렬 기준
        Comparator<Integer> reverse = (v1, v2) -> (v2 - v1);

        // stream() 예시
        int[] arr = new int[]{3, 0, 6, 1, 5};

        // boxed() 메서드는 Java 스트림에서 사용되는 메서드로,
        // 기본형 타입(primitive type)을 해당하는 참조형 타입(wrapper type)으로 변환하는 역할을 합니다.
        // stream()의 boxed() 메서드를 사용하면 기저 자료형을 원하는 정렬기준으로 쉽게 정렬 가능
        int[] reversed = Arrays.stream(arr)
                .boxed() // Stream<Integer>로 변환됨
                .sorted((v1, v2) -> v2 - v1)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(reversed));
    }

    public static void stringExample() {
        String[] arr = new String[] { "apple", "orange", "banana", "fruit", "grape", "watermelon", "sort", "ab"};
        // 기본 정렬 기준이 사전순인 문자열을 길이 순서대로 정렬하고 싶으면 아래처럼 하면 됨
        Arrays.sort(arr, (v1, v2) -> v1.length() - v2.length());
        System.out.println(Arrays.toString(arr));
    }
}
