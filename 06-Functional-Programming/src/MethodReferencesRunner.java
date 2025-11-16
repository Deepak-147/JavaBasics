import java.util.List;

/**
 * Author: ldeepak
 */

/**
 * Method References provide a way to refer to methods without executing them.
 * They are a shorthand notation of a lambda expression to call a method.
 * Method references can be used to make the code more readable and concise.
 * syntax: classname::functionname
 */
public class MethodReferencesRunner {

    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        // Using method reference
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(System.out::println);

    }
}
