package _4tryfinally;

import java.util.Random;

public class _40TryFinallyFinished {
    public boolean myMethod() {
        try {
            /* ... code ... */

            if (thisCondition()) {
                return false;
            }

            /* ... more code ... */

            if (thatCondition()) {
                return false;
            }

            /* ... even more code ... */
            return lastCondition();
        } catch (Exception e) {
            System.err.println("Oh noes! An exception has occurred " + e.getMessage());
            return false;
        } finally {
            cleanupCode();
        }
    }


























    private boolean thisCondition() {
        System.out.println("This condition");
        return new Random().nextBoolean();
    }

    private boolean thatCondition() {
        System.out.println("That condition");
        return new Random().nextBoolean();
    }

    private boolean lastCondition() {
        System.out.println("Last condition");
        return new Random().nextBoolean();
    }

    private void cleanupCode() {
        System.out.println("Cleaning up our mess!");
    }
}
