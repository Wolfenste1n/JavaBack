package StringsW3;

public class SpecialCharacters {
    public static void main(String[] args) {
        //  String txt = "We are the so-called "Vikings" from the north."; // error
        //  \' =  ' = Single quote
        //  \" = " = Double quote
        //  \\ = \ = Backslash
        // \n = new line
        // \t = tab
        // \b = Backspace
        // \r = Carriage Return?
        // \f = Form Feed

        String txt = "We are the so-called \"Vikings\" from the north."; // \" Vikings \" = "Vikings"
        String txt1 = "It\'s alright."; // It's
        String txt2 = "How are you means \'Kak dela?\'";
        String txt3 = "I love \\ backslash \\";
        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);

    }
}
