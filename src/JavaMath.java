public class JavaMath {
    public static void main(String[] args) {
        // Math = class in Java it has many methods
        System.out.println(Math.max(5, 10)); // 10 (5<10)
        System.out.println(Math.min(5, 10)); // 5  (10>5)
        System.out.println(Math.sqrt(64)); // 8 (float)
        System.out.println(Math.abs(-9.3)); // 9.3
        System.out.println(Math.pow(2, 4)); // 16.0 (double)
        System.out.println(Math.round(4.5)); // 5
        System.out.println(Math.floor(4.9)); // 4.0
        System.out.println(Math.ceil(4.1)); // 5.0
        System.out.println(Math.random()); //between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println((Math.random() * 101)); // 0 to 100 (double)
        System.out.println((int)(Math.random() * 101)); // 0 to 100 (int)
    }
}
