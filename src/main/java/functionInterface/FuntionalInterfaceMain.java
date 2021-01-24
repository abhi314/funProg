package functionInterface;

import java.util.function.Function;

public class FuntionalInterfaceMain {
    public static void main(String[] args) {
        System.out.println(plusOne.andThen(mul10).apply(1));
    }

    static Function<Integer, Integer> plusOne = t -> ++t;
    static Function<Integer, Integer> mul10 = t -> t * 10;
}
