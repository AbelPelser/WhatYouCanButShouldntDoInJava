package reflection;

import java.util.function.Supplier;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        twoObjectsOfAnonymousInnerClass();
    }

    private static void twoObjectsOfAnonymousInnerClass() {
        Supplier<String> normalSupplier = () -> "Hello Sogeti";
    }
}
