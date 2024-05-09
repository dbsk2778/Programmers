package regular_expression.in_book.level_1;

public class programmers_149 {

  /*
      p. 149 / programmers_72410
      문제: 신규 아이디 추천
   */
  public static void main(String[] args) {
    System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    System.out.println(solution("z-+.^."));

    System.out.println(solution2("...!@BaT#*..y.abcdefghijklm"));
    System.out.println(solution2("z-+.^."));
  }

  public static String solution(String s) {
    // 1단계: 대문자를 소문자로 변경
    s = s.toLowerCase();
    // 2단계: 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
    // ex. [^abc]: a, b, c를 제외한 모든 문자
    s = s.replaceAll("[^-_.a-z0-9]", "");
    // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환
    s = s.replaceAll("[.]{2,}", ".");
    // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
    s = s.replaceAll("^[.]|[.]$", "");
    // 5단계: 빈 문자열이라면, "a"를 대입
    if (s.isEmpty()) {
      s = "a";
    }
    // 6단계: 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
    if (s.length() >= 16) {
      s = s.substring(0, 15);
      // 제거 후 마지막 문자가 마침표(.)라면 제거
      s = s.replaceAll("[.]$", "");
    }
    // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
    while (s.length() < 3) {
      s += s.charAt(s.length() - 1);
    }
    return s;
  }

  public static String solution2(String new_id) {

    return new KAKAOID(new_id)
        .replaceToLowerCase()
        .filter()
        .toSingleDot()
        .noStartEndDot()
        .noBlank()
        .noGreaterThan16()
        .noLessThan2()
        .getResult();
  }

  private static class KAKAOID {
    private String s;

    // 생성자
    KAKAOID(String s) {
      this.s = s;
    }

    private KAKAOID replaceToLowerCase() {
      s = s.toLowerCase();
      return this;
    }

    private KAKAOID filter() {
      s = s.replaceAll("[^a-z0-9._-]", "");
      return this;
    }

    private KAKAOID toSingleDot() {
      s = s.replaceAll("[.]{2,}", ".");
      return this;
    }

    private KAKAOID noStartEndDot() {
      s = s.replaceAll("^[.]|[.]$", "");
      return this;
    }

    private KAKAOID noBlank() {
      s = s.isEmpty() ? "a" : s;
      return this;
    }

    private KAKAOID noGreaterThan16() {
      if (s.length() >= 16) {
        s = s.substring(0, 15);
      }
      s = s.replaceAll("[.]$", "");
      return this;
    }

    private KAKAOID noLessThan2() {
      StringBuilder sBuilder = new StringBuilder(s);
      while (sBuilder.length() <= 2) {
        sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
      }
      s = sBuilder.toString();
      return this;
    }

    private String getResult() {
      return s;
    }
  }
}
