package comparison;

public class Comparison {
    public static void main(String[] args) {
        var x = 1;

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
