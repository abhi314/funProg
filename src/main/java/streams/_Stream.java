package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("abhi", MALE),
                new Person("apurva", FEMALE),
                new Person("meena", FEMALE),
                new Person("supriya", FEMALE)
        );

        people.stream()
                .map(p -> p.gen)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("-------------------------");

        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        Function<Person, String> personStringFunction = p -> p.name;

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);
        System.out.println("-------------------------");

        Predicate<Person> personPredicate = p -> FEMALE.equals(p.getGen());
        boolean b = people.stream().allMatch(personPredicate);
        System.out.println(b);
    }

    static class Person {
        private final String name;
        private final Gender gen;

        Person(String name, Gender gen) {
            this.name = name;
            this.gen = gen;
        }

        public String getName() {
            return name;
        }

        public Gender getGen() {
            return gen;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gen=" + gen +
                    '}';
        }
    }

    static enum Gender {
        MALE, FEMALE
    }
}
