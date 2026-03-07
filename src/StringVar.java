public class StringVar {
    // String - collection of characters (String = object (contains methods))
    public static void main(String[] args) {
        String myName = "  Madiyar  ";
        String mySurname = "Kenzhebayev";
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.indexOf("M")); // 0
        System.out.println(myName.charAt(0)); // M
        System.out.println(myName.equals(mySurname)); // false
        System.out.println(myName);
        System.out.println(myName.trim());

    }
}
