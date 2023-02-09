package _0labels;

import java.time.Month;

import static java.time.Month.FEBRUARY;
import static java.time.Month.MARCH;

@SuppressWarnings("ALL")
public class _01ClassifyMonthFinished {
    private static void classifyMonth(Month month) {
        switch (month) {
            case JANUARY:
                FEBRUARY:
                MARCH:
                APRIL:
                SEPTEMBER:
                OCTOBER:
                NOVEMBER:
                DECEMBER:
                System.out.println("The 'r' is in the month! Put on a jacket!");
                break;
            case MAY:
                JUNE:
                JULY:
                AUGUST:
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