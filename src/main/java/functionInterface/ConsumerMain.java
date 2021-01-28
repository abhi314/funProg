package functionInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        cons.accept(new Customer("Abhi", "8451623084"));
        biCons.accept(new Customer("Abhi", "8451623084"), true);
        biCons.accept(new Customer("Abhi", "8451623084"), false);
    }

    static Consumer<Customer> cons = t -> System.out.println(t.name + "|" + t.no);
    static BiConsumer<Customer, Boolean> biCons = (t, u) -> System.out.println(t.name + "|" + (u ? t.no : "9999999999"));

    static class Customer {
        private final String name;
        private final String no;

        Customer(String name, String no) {
            this.name = name;
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public String getNo() {
            return no;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", no='" + no + '\'' +
                    '}';
        }
    }
}
