package functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionalInterfaceMain {
    public static void main(String[] args) {
        System.out.println(plusOne.andThen(mul10).apply(1));
        System.out.println(biTest.apply(2, 12));
    }

    static Function<Integer, Integer> plusOne = t -> ++t;
    static Function<Integer, Integer> mul10 = t -> t * 10;

    static BiFunction<Integer, Integer, Integer> biTest = (t, v) -> (t + 1) * v;
}
