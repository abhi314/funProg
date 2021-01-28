package functionInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        System.out.println(pred.test("9995"));
        System.out.println(pred.and(contain3).test("93"));
        System.out.println(pred.or(contain3).test("94"));
        System.out.println(biPred.test("9995", "3"));
    }

    static Predicate<String> pred = t -> t.startsWith("9");
    static Predicate<String> contain3 = t -> t.contains("9");
    static BiPredicate<String, String> biPred = (t, u) -> t.contains("9") && u.contains("3");
}
