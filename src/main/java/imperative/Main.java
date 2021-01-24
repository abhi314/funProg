package imperative;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("abhi", Gender.MALE),
                new Person("apurva", Gender.FEMALE),
                new Person("meena", Gender.FEMALE),
                new Person("supriya", Gender.FEMALE)
        );

        Predicate<Person> pre = p -> Gender.FEMALE.equals(p.getGen());

        people.stream()
                .filter(pre)
                .collect(Collectors.toList())
                .forEach(System.out::println);
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

    enum Gender {
        MALE, FEMALE
    }
}
