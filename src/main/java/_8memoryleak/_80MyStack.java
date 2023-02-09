package _8memoryleak;

/**
 * Memory leak in Java.
 *
 * @param <T>
 */
@SuppressWarnings({"ManualArrayCopy", "unused"})
public class _80MyStack<T> {
    private Object[] array = new Object[8];
    private int index = 0;

    public void push(T element) {
        if (index == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index++] = element;
    }

    public T pop() {
        return (T) array[--index];
    }
}
