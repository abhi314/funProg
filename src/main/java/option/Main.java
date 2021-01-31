package option;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("Hello")
                .ifPresent(v -> System.out.println(v + " Abhishek"));

    }
}
