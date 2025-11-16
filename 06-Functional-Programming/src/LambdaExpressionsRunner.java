import java.util.List;
import java.util.function.Predicate;

/**
 * Author: ldeepak
 */

/**
 * filter method accepts a Predicate functional interface as an argument.
 * The Predicate Functional interface has a single abstract method test(T t) that takes an input of type T and returns a boolean value.
 * In this example, we use a lambda expression n -> n % 2 == 0 to define the filtering condition.
 * The compiler creates an implementation of the Functional Interface Predicate behind the scenes by providing the implementation for the test method.
 *
 * forEach method accepts a Consumer functional interface as an argument.
 * The Consumer functional interface has a single abstract method accept(T t) that takes an input of type T and returns void.
 * In this example, we use a lambda expression n -> System.out.println(n) to define the action to be performed on each element.
 * The compiler creates an implementation of the Functional Interface Consumer behind the scenes by providing the implementation for the accept method.
 */
public class LambdaExpressionsRunner {

    public static void main(String[] args) {
        // Using lambda expression to implement Predicate functional interface
        List.of(23, 45, 50, 65, 33, 12)
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n)); // [50, 12]

        // Explicitly implementing Predicate functional interface
        // Both approaches yield the same result
        List.of(23, 45, 50, 65, 33, 12)
                .stream()
                .filter(new EvenNumberPredicate())
                .forEach(n -> System.out.println(n)); // [50, 12]
    }
}

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}
