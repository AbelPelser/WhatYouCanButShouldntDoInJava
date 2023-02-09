package _1reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

@SuppressWarnings("ALL")
public class _11AnonymousInnerClassFinished {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        twoObjectsOfAnonymousInnerClass();
    }

    private static void twoObjectsOfAnonymousInnerClass() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Supplier<String> normalSupplier = () -> "Hello Sogeti";
        var c = normalSupplier.getClass();
        var cons = c.getDeclaredConstructors()[0];
        cons.setAccessible(true);
        var suplier2 = (Supplier<String>) cons.newInstance();

        System.out.println(normalSupplier.get());
        System.out.println(suplier2.get());
        System.out.println(System.identityHashCode(normalSupplier));
        System.out.println(System.identityHashCode(suplier2));
        System.out.println(normalSupplier.getClass().getName());
        System.out.println(suplier2.getClass().getName());
    }
}
