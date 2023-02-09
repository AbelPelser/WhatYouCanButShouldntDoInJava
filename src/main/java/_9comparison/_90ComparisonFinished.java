package _9comparison;

public class _90ComparisonFinished {
    public static void classifyDouble(double x) {
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




























    public static void main(String[] args) {
        classifyDouble(Double.NaN);
    }
}
