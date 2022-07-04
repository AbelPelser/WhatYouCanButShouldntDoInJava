package stringconcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i <= 10_000_000; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
