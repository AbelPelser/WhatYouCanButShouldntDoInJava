package tryfinally;

import java.util.Random;

public class TryFinallyFinished {
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
        } finally {
            commonCode();
        }
    }


















    private boolean thisCondition()
    {
        return new Random().nextBoolean();
    }

    private boolean thatCondition()
    {
        return new Random().nextBoolean();
    }

    private boolean lastCondition()
    {
        return new Random().nextBoolean();
    }

    private void commonCode()
    {
    }
}
