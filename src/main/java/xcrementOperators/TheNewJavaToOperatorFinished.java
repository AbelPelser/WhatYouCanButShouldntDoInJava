package xcrementOperators;

public class TheNewJavaToOperatorFinished {
    private static void countDownToZero(int from) {
        while(from --> 0) {
            System.out.println("Counting... " + (from + 1));
        }
        System.out.println("Done!");
    }

    public static void main(String[] args) {
        System.out.println("Let's count down from 2");
        countDownToZero(2);
        System.out.println("And now from 5?");
        countDownToZero(5);
        System.out.println("It works!");
    }
}
