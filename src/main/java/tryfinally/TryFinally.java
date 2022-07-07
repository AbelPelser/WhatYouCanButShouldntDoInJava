package tryfinally;

import java.util.Random;

public class TryFinally {
    public boolean myMethod() {
        /* ... code ... */

        if (thisCondition()) {
            commonCode();
            return false;
        }

        /* ... more code ... */

        if (thatCondition()) {
            commonCode();
            return false;
        }

        /* ... even more code ... */

        commonCode();
        return lastCondition();
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
