package level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class programmers120835 {
    public static void main(String[] args) {
        int[] emergency = new int[]{3, 76, 24};
        int[] result = solution(emergency);
        System.out.println(Arrays.toString(result));  // 결과 출력: [3, 1, 2]
    }

    // 배열의 크기가 클수록 이중 반복문을 쓰는것보다 hash map을 쓰는 게 성능이 더 좋음 !!
    public static int[] solution(int[] emergency) {
        // 원본 배열 복사
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);

        // 복사된 배열 내림차순 정렬
        Arrays.sort(sortedEmergency);

        // 원본 배열의 값이 내림차순으로 정렬된 배열에서 몇 번째인지 기록
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sortedEmergency.length; i++) {
            rankMap.put(sortedEmergency[i], sortedEmergency.length - i);
        }

        // 원본 배열의 각 값에 대해 순위를 매겨 새로운 배열에 저장
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = rankMap.get(emergency[i]);
        }

        return answer;
    }
}
