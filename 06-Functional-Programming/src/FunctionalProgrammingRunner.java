import java.sql.SQLOutput;
import java.util.List;

/**
 * Author: ldeepak
 */

/**
 * Functional programming in Java is a style where you focus on writing code using functions, avoiding changing state and mutable data.
 * Instead of telling the computer step-by-step how to do something (imperative), you describe what you want done (declarative).
 * Key concepts:
 * Immutability: Data does not change after it's created.
 * First-class functions: Functions can be passed as arguments, returned from other functions, and assigned to variables.
 * No side effects: Functions do not modify outside variables or states.
 */
public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

        printBasic(list); // Apple, Bat, Cat, Dog
        printWithFP(list); // Apple, Bat, Cat, Dog

        printBasicWithFiltering(list); // Bat, Cat
        printWithFPWithFiltering(list); // Bat, Cat
    }

    // Imperative approach, "how to do" step by step
    private static void printBasic(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Imperative approach, "how to do" step by step
    private static void printBasicWithFiltering(List<String> list) {
        for (String item : list) {
            if (item.endsWith("at")) {
                System.out.println(item);
            }
        }
    }

    // Declarative approach, "what to do" rather than "how to do"
    private static void printWithFP(List<String> list) {
        list.stream()
                .forEach(element -> System.out.println(element)); // Use of lambda expression (shorter syntax for defining functions)
    }

    // Declarative approach, "what to do" rather than "how to do"
    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at")) // Intermediate operation; result of intermediate operation is another stream
                .forEach(element -> System.out.println(element)); // Terminal operation; consume the data or produce the result
    }
}
