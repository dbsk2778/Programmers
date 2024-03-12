package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class delete_array
{
    
    // 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고
    // 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] delete_list = {3, 5};
        
        System.out.println(Arrays.toString(solution(arr, delete_list)));
        System.out.println(Arrays.toString(solution2(arr, delete_list)));
        System.out.println(Arrays.toString(solution3(arr, delete_list)));
    }
    
    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++) {
            boolean isDeleted = false;
            for ( int j = 0; j < delete_list.length; j++) {
                if ( arr[i] == delete_list[j] ) {
                    isDeleted = true;
                    break;
                }
            }
            if ( !isDeleted ) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for ( int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public static int[] solution2 (int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for ( int k : arr )
            {
                boolean isDeleted = false;
                for ( int i : delete_list )
                    {
                        if ( k == i )
                            {
                                isDeleted = true;
                                break;
                            }
                    }
                if ( !isDeleted )
                    {
                        list.add(k);
                    }
            }
        
        int[] answer = new int[list.size()];
        
        for ( int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public static int[] solution3 (int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        for(int n: delete_list) {
            list.remove((Integer) n); // Integer을 붙이지 않으면 인덱스 삭제가 됨, Integer을 붙이면 값 삭제가 됨
        }
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
