package functionInterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        System.out.println(getDBConnection.get());

    }

    static Supplier<String> getDBConnection = () -> "http://www.abhi314.com";
}
