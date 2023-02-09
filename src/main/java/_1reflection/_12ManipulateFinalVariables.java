package _1reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import static java.util.Collections.synchronizedMap;

public class _12ManipulateFinalVariables {
    public static void main(String[] args) throws Exception {
        makeEnvironmentWritable();
        System.getenv().put("Key", "Value");
        System.out.println(System.getenv().get("Key"));
    }





    private static void makeEnvironmentWritable() throws Exception {
        System.err.close();
        var oldMap = System.getenv();
        var processEnvironment = Class.forName("java.lang.ProcessEnvironment");
        var unmodifiableMapField = processEnvironment.getDeclaredField("theUnmodifiableEnvironment");
        unmodifiableMapField.setAccessible(true);
        var modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(unmodifiableMapField, unmodifiableMapField.getModifiers() & ~Modifier.FINAL);
        var globalPropertyMap = synchronizedMap(new HashMap<Object, Object>(oldMap));
        unmodifiableMapField.set(null, globalPropertyMap);
    }
}
