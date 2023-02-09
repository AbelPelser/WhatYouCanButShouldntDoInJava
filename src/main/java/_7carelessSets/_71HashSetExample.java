package _7carelessSets;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashSet;

@SuppressWarnings("ALL")
public class _71HashSetExample {
    @ToString
    @AllArgsConstructor
    static class Book {
        private final int price;
        private final String title;

        @Override
        public boolean equals(Object obj) {
            return price == ((Book) obj).price;
        }

        @Override
        public int hashCode() {
            // "It isn't what the book costs. It's what it will cost you if you don't read it."
            return price;
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
