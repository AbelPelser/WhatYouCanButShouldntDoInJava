package _6stringconcatenation;

public class _60StringConcatenation {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 10_000_000; i++) {
            result.append(i);
        }
        System.out.println(result);
    }
}
