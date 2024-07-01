package int_function;

public class IntFunction {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        // arr1 의 길이가 arr2의 길이보다 작으므로 -1 출력
        System.out.println(Integer.compare(arr1.length, arr2.length));
    }
}
