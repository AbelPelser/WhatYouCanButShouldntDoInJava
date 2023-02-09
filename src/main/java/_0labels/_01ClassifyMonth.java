package _0labels;

import java.time.Month;

import static java.time.Month.FEBRUARY;

@SuppressWarnings("ALL")
public class _01ClassifyMonth {
    private static void classifyMonth(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("The 'r' is in the month! Put on a jacket!");
                break;
            case MAY:
                System.out.println("There is no 'r' in the month. Dress lightly.");
                break;
            default:
                System.out.println("You specified an non-existing month. Shame on you!");
        }
    }

    public static void main(String[] args) {
        classifyMonth(FEBRUARY);
    }
}