package carelessSets;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashSet;

public class HashSetExample {
    @ToString
    @AllArgsConstructor
    static class Book {
        private final int price;
        private final String title;

        @Override
        public boolean equals(Object obj) {
            // We are ALL equal
            return true;
        }

        @Override
        public int hashCode() {
            // Why use many digit when few do trick
            return 1;
        }
    }

    private static void unsortedSetOfBooks() {
        var set = new HashSet<Book>();
        set.add(new Book(5, "Hello world"));
        set.add(new Book(7, "Hello world - second edition"));
        set.add(new Book(6, "Hello world - third edition"));
        set.add(new Book(5, "Hello world - return of the thing"));
        set.add(new Book(7, "Bye world"));
        System.out.println(set);
    }

    public static void main(String[] args) {
        unsortedSetOfBooks();
    }
}
