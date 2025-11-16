/**
 * Author: ldeepak
 */

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Terminal operations in Java Streams are operations that produce a result or a side effect and mark the end of the stream processing.
 * They trigger the processing of the data in the stream and can return a non-stream result, such as a primitive value, a collection, or no value at all (void).
 * Examples include forEach, collect, reduce, etc...
 */
public class TerminalOperators {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(23,12,34,53);

        sumNumbers(numbers); // 122
        maxNumber(numbers); // 53
        minNumber(numbers); // 12
        oddNumbers(numbers); // 23,53
        squareNumbers(numbers); // [529, 144, 1156, 2809]
    }

    private static void sumNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                    .reduce(0, (num1, num2) -> num1 + num2); // Terminal operation
        System.out.println("Sum: " + sum);
    }

    private static void maxNumber(List<Integer> numbers) {
        int max = numbers.stream()
                    .max((num1, num2) -> Integer.compare(num1, num2)) // Terminal operation
                    .get(); // get() to retrieve the value from Optional
        System.out.println("Max: " + max);
    }

    private static void minNumber(List<Integer> numbers) {
        int min = numbers.stream()
                    .min((num1, num2) -> Integer.compare(num1, num2)) // Terminal operation
                    .get(); // get() to retrieve the value from Optional
        System.out.println("Min: " + min);
    }

    private static void oddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = numbers.stream()
                                        .filter(number -> number % 2 != 0) // Intermediate operation
                                        .collect(Collectors.toList()); // Terminal operation
        System.out.println("Odd Numbers: " + oddNumbers);
    }

    private static void squareNumbers(List<Integer> numbers) {
        List<Integer> squaredNumbers = numbers.stream()
                                        .map(number -> number * number) // Intermediate operation
                                        .collect(Collectors.toList()); // Terminal operation
        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}
