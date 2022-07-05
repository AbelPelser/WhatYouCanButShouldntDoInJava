package xcrementOperators;

public class MultipleInOneLine {
    private static int doThing(int a) {
        System.out.println("doThing(" + a + ")");
        return --a;
    }


    private static void multipleInOneLine() {
        int x = 5;
        /*  -1  5       3 -3   2 -1  3 -6    2       3      4*/
        int y = x-- + --x * (--x - ++x) * doThing(doThing(++x));
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        multipleInOneLine();
    }
}
