package twoplustwo;

import java.lang.reflect.Field;

public class ChangeIntegerCache {
    public static void someInnocentCode() throws NoSuchFieldException, IllegalAccessException {
        Class<?> cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];
    }
}
