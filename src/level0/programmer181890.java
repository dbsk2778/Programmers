package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmer181890 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(solution2(new String[]{"u", "u", "l", "r"})));
    }

    public static String[] solution(String[] str_list) {
        List<String> l = new ArrayList<>();
        String direction = "";
        int index = 0;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                direction = "left";
                index = i;
                break;
            } else if (str_list[i].equals("r")) {
                direction = "right";
                index = i;
                break;
            }
        }

        if (!direction.isEmpty()) {
            if (direction.equals("left")) {
//                for (int i = 0; i < index; i++) {
//                    l.add(str_list[i]);
//                }
                l.addAll(Arrays.asList(str_list).subList(0, index));
            } else {
//                for (int i = index + 1; i < str_list.length; i++) {
//                    l.add(str_list[i]);
//                }
                l.addAll(Arrays.asList(str_list).subList(index + 1, str_list.length));
            }
        }

        // 이 메서드는 리스트의 요소를 전달된 배열 a에 담아 반환, 만약 전달된 배열의 크기가 리스트의 크기보다 작으면, 내부적으로 리스트 크기에 맞는 새로운 배열이 생성
        // toArray(): 이 메서드는 Object[] 배열을 반환하며, 후속 타입 캐스팅이 필요하기에 타입 안정성이 떨어짐
        // toArray(new String[0]): 이 메서드는 타입 안정성이 보장되는 String[] 배열을 반환 자바의 제네릭 타입 시스템을 활용할 수 있어 안전하고, 추가적인 캐스팅이 필요 없음
        // 0 크기의 배열 전달: new String[0]과 같이 크기가 0인 배열을 전달하는 것은 자바 개발자들 사이에서 일종의 관용적인 방법으로
        // 자바는 전달된 배열의 크기가 0이더라도, 적절한 크기의 새로운 배열을 생성하여 반환해 주기 때문에, 크기가 0인 배열은 자주 사용되는 전략인데, 메모리를 절약하면서도 타입을 명시적으로 지정할 수 있기 때문
        return l.toArray(new String[0]);
    }

    // 바로 리턴해주기도 가능
    public static String[] solution2(String[] str_list) {

        for (int i = 0; i < str_list.length; i++) {

            if ("l".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if ("r".equals(str_list[i])) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }

        return new String[0];
    }

    // or break;
    public static String[] solution3(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, i);
                break;
            } else if (str_list[i].equals("r")) {
                answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            }
        }
        return answer;
    }
}
