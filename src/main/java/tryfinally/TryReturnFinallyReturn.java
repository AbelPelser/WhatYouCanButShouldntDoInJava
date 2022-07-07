package tryfinally;

public class TryReturnFinallyReturn {
    public static int tryReturnFinallyReturn() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(tryReturnFinallyReturn());
    }
}
