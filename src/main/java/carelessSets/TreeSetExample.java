package carelessSets;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.TreeSet;

public class TreeSetExample {
    @ToString
    @AllArgsConstructor
    static class Book implements Comparable<Book> {
        private final int price;
        private final String title;

        @Override
        public int compareTo(Book o) {
            return price - o.price;
        }
    }

    private static void sortedSetOFBooks() {
        var set = new TreeSet<Book>();
        set.add(new Book(5, "Hello world"));
        set.add(new Book(7, "Hello world - second edition"));
        set.add(new Book(6, "Hello world - third edition"));
        set.add(new Book(5, "Hello world - return of the thing"));
        set.add(new Book(7, "Bye world"));
        System.out.println(set);
    }

    public static void main(String[] args) {
        sortedSetOFBooks();
    }
}
