package StringsW3;

public class NumbersAndStrings {
    // Numbers are added. Strings are concatenated.
    public static void main(String[] args) {
        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z will be 1020 (a String)
        int x2 = 10;
        int y2 = 20;
        int z2 = x2 + y2;
        System.out.println(z); // 1020
        System.out.println(z1); // 1020
        System.out.println(z2); // 30

    }
}
