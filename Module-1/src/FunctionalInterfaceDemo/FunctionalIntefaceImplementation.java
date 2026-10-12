package FunctionalInterfaceDemo;
import java.util.function.*;

public class FunctionalIntefaceImplementation
{
    public static void main(String[] args) {

        // Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello Java");

        // Supplier
        Supplier<Integer> supply = () -> 100;
        System.out.println(supply.get());

        // Function
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));

        // Predicate
        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
        System.out.println(even.test(7));

        // BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10, 5));
    }
}