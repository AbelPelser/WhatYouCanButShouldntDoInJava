package labels;

import java.time.Month;

import static java.time.Month.*;

@SuppressWarnings({"UnusedLabel", "TextLabelInSwitchStatement"})
public class LabelsInSwitched {
    private static void labelsInSwitch(Month month) {
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
            case MAY:
                JUNE:
                JULY:
                AUGUST:
                System.out.println("There is no 'r' in the month. Dress lightly.");
            default:
                System.out.println("You specified an non-existing month. Shame on you!");
        }
    }

    public static void main(String[] args) {
        labelsInSwitch(MARCH);
    }
}