package reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

import static java.lang.System.*;

public class AnonymousInnerClassFinished {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        twoObjectsOfAnonymousInnerClass();
    }

    private static void twoObjectsOfAnonymousInnerClass() throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Supplier<String> normalSupplier = () -> "Hello Sogeti";
        out.println("Result 1: " + normalSupplier.get());
        out.println("Class 1: " + normalSupplier.getClass().getSimpleName());
        out.println("Object ID 1: " + identityHashCode(normalSupplier));

        var clazz = normalSupplier.getClass();
        var constructor = clazz.getDeclaredConstructors()[0];
        constructor.setAccessible(true);

        Supplier<String> strangeSupplier = (Supplier<String>) constructor.newInstance();
        out.println("Result 2: " + strangeSupplier.get());
        out.println("Class 2: " + strangeSupplier.getClass().getSimpleName());
        out.println("Object ID 2: " + identityHashCode(strangeSupplier));
    }
}
