package Conditions;
// variable = (condition) ? expressionTrue :  expressionFalse;
public class Shortcut {
    public static void main(String[] args) {
//        int time = 20;
//        if (time < 18) {
//            System.out.println("Good day.");
//        } else {
//            System.out.println("Good evening.");
//        } same as

//        int time = 20;
//        String result = (time < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);

        // and
//        int time = 20;
//        System.out.println((time < 18) ? "Good day." : "Good evening.");

        int time = 22;
        String message = (time < 12) ? "Good morning."
                : (time < 18) ? "Good afternoon."
                : "Good evening.";
        System.out.println(message);

    }
}
