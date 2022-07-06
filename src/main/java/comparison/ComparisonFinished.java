package comparison;

public class ComparisonFinished {
    public static void main(String[] args) {
        var x = Double.NaN;

        if (x < 0) {
            System.out.println("x < 0");
        } else if (x == 0) {
            System.out.println("x == 0");
        } else if (x > 0) {
            System.out.println("x > 0");
        } else {
            System.out.println("?!?!?");
        }
    }
}
