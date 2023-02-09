package _1reflection._10twoplustwo;

import java.lang.reflect.Field;

public class _10SomeInnocentCode {
    public static void someInnocentCode() throws NoSuchFieldException, IllegalAccessException {
        //Suppress warnings
        System.err.close();

        Class<?> cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];
    }
}
