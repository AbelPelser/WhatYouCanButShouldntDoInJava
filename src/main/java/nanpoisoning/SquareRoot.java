package nanpoisoning;

import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
    public static void checkSumSquareRootsNotAbove10(List<Double> values) {
        List<Double> squareRoots = values.stream().map(Math::sqrt).collect(Collectors.toList());
        double sum = squareRoots.stream().mapToDouble(x -> x).sum();
        if (sum > 10.0) {
            throw new RuntimeException("Sum of the square roots should not be avove 10");
        }
    }

    public static void main(String[] args) {
        List<Double> values = List.of(100.0, -1.0, 0.1);
        checkSumSquareRootsNotAbove10(values);
        System.out.println("Check ok");
    }
}
