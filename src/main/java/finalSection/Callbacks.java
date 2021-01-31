package finalSection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {

        hello("abhi", null, val -> System.out.println("inside callback"));
        hello2("abhi", null, () -> System.out.println("inside runnable"));

    }

    static void hello(String fname, String lname, Consumer<String> callback) {
        if (null != lname) {
            System.out.println(lname);
        } else {
            callback.accept(fname);
        }
    }

    static void hello2(String fname, String lname, Runnable callback) {
        if (null != lname) {
            System.out.println(lname);
        } else {
            callback.run();
        }
    }
}
