package StringsW3;

public class Concatenation {
    // StringsW3.Concatenation = string + string
    // Numbers are added. Strings are concatenated.
    public static void main(String[] args) {
        String txt1 = "Madik";
        String txt2 = "Kenzh";
        String name = "John";
        int age = 25;
        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(txt1 + txt2); // or ->
        System.out.println(txt1.concat(txt2));
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println(result);



    }
}
