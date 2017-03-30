package Main;

public class Test {

    public static void print(String string, boolean check) {
        String bool = check ? "... OK." : ": ERROR.";
        System.out.println(string + "" + bool);
    }
}
