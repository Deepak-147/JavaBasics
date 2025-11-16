import java.util.List;

/**
 * Author: ldeepak
 */
/**
 * Intermediate operations in Java Streams are operations that transform a stream into another stream.
 * They are "lazy," meaning they do not process the data until a terminal operation is invoked.
 * Examples include filter, map, sorted, and distinct.
 */
public class IntermediateOperators {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,5,8,213,45,4,7,5,8);

        sortNumbers(numbers); // 3,4,5,5,7,8,8,45,213
        distinctNumbers(numbers); // 3,5,8,213,45,4,7
        squareNumbers(numbers); // 9,25,64,45369,2025,16,49,25,64
    }

    private static void sortNumbers(List<Integer> numbers) {
        numbers.stream()
                .sorted() // Intermediate operation; returns a new stream with sorted elements
                .forEach(number -> System.out.println(number));
    }

    private static void distinctNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct() // Intermediate operation; returns a new stream with distinct elements
                .forEach(number -> System.out.println(number));
    }

    private static void squareNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number) // Intermediate operation; returns a new stream with squared elements
                .forEach(number -> System.out.println(number));
    }
}
