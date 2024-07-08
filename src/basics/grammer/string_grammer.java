package basics.grammer;

public class string_grammer {

    public static void main(String[] args) {
        charToIntForAscii();
        charToIntUsingLibrary();
    }
    // char -> int
    public static void charToIntForAscii() {
        // ASCII code
        char c = '9';
        int i = c - '0';
        System.out.println(i); // 9

        char c2 = 'B';
        int i2 = c2 - 'A';

        System.out.println(i2); // 0

        char c3 = 'b';
        int i3 = c3 - 'a';

        System.out.println(i3); // 0
    }

    public static void charToIntUsingLibrary() {
        char c = '9';
        int i = Character.getNumericValue(c);
        System.out.println(i); // 9
    }


}
