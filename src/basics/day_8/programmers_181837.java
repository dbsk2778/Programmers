package basics.day_8;

public class programmers_181837 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181837
        커피 심부름
     */

    public static void main(String[] args) {
        String[] orders = {"americano", "icecafelatte", "americano", "cafelatte", "americano", "cafelatteice"};
        System.out.println(solution(orders));
        System.out.println(solution2(orders));
        System.out.println(solution3(orders));
        System.out.println(solution4(orders));
    }

    public static int solution(String[] orders) {
        int answer = 0;

        for (String order : orders) {
            int price = switch (order) {
                case "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything" -> 4500;
                default -> 5000;
            };
            answer += price;
        }
        return answer;
    }

    public static int solution2(String[] orders) {
        int answer = 0;

        for (String order : orders) {
            int price = 0;
            switch (order) {
                case "iceamericano":
                case "americanoice":
                case "hotamericano":
                case "americanohot":
                case "americano":
                case "anything":
                    price = 4500;
                    break;
                default:
                    price = 5000;
            }
            answer += price;
        }
        return answer;
    }

    public static int solution3(String[] order) {
        int answer = 0;
        for (String o : order) {
            if (o.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }

    public static int solution4(String[] order) {
        int answer = 0;
        for (String menu : order) {
            answer += menu.contains("cafelatte") ? 5000 : 4500;
        }
        return answer;
    }
}
