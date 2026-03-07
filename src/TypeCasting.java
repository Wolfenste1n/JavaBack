public class TypeCasting {
    // Type casting - convert one data type to another (int to double)
    // передаем значение переменной одного типа данных в другую
    // Widening casting (automatic, smaller to larger)
    // byte -> short -> char -> int -> long -> float -> double
    // Narrowing Casting (manual, larger to smaller)
    // double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {
        // Widening
//        int myInt = 9;
//        double myDouble = myInt;
//        System.out.println(myInt); // 9
//        System.out.println(myDouble); // 9.0

        // Narrowing
//        double myDouble = 9.9d;
//        int myInt = (int) myDouble;
//        System.out.println(myDouble); // 9.9
//        System.out.println(myInt); // 9

        int maxScore = 500;
        int userScore = 423;
        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println("User's percentage is " + percentage + "%");


    }

}
