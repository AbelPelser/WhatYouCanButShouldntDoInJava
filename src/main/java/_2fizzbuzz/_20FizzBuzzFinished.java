package _2fizzbuzz;

import java.util.Map;

/**
 * FizzBuzz without for loops, foreach loops, while loops, if statements, switches, ternary operators and without streams.
 *
 * @author Johan de Jong
 */
public class _20FizzBuzzFinished {
    private final Map<Boolean, Integer> boolToInt = Map.of(false, 0, true, 1);

    public static void main(String[] args) {
        new _20FizzBuzzFinished().start(1);
    }

    private boolean start(int x) {
        String[] values = {Integer.toString(x), "Fizz", "Buzz", "FizzBuzz"};
        int index = boolToInt.get(x % 3 == 0) + 2 * boolToInt.get(x % 5 == 0);
        System.out.println(values[index]);
        return x == 100 || start(x + 1);
    }
}
