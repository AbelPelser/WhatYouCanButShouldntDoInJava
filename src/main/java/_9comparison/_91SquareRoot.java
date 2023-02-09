package _9comparison;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class _91SquareRoot {
    public static void checkSumSquareRootsNotAbove10(List<Double> values) {
        List<Double> squareRoots = values.stream().map(Math::sqrt).collect(toList());
        double sum = squareRoots.stream().mapToDouble(x -> x).sum();
        if (Double.isNaN(sum) || sum > 10.0) {
            throw new RuntimeException("Sum of the square roots should not be above 10");
        }
    }

    public static void main(String[] args) {
        List<Double> values = List.of(1.0, 100.0, 0.1, -1.0, 1000.0);
        checkSumSquareRootsNotAbove10(values);
        System.out.println("Check ok");
    }
}
