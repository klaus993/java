package Main;

public class Test {
    public static void testPrint(String string, boolean check) {
        String bool = check ? "... OK." : ": ERROR.";
        System.out.println(string + "" + bool);
    }
}
