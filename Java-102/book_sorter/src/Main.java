import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", 281);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", "1813", 279);
        Book book3 = new Book("Dracula", "Bram Stoker", "1897", 418);
        Book book4 = new Book("War and Peace", "Leo Tolstoy", "1869", 1440);
        Book book5 = new Book("Crime and Punishment", "Fyodor Dostoevsky", "1866", 430);

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println("Sort Books by Alphabet");
        for (Book book : bookSet) {
            System.out.println("Name: " + book.getName());
        }

        System.out.println();

        TreeSet<Book> bookSet2 = new TreeSet<>(new PageNumberComparator());

        bookSet2.add(book1);
        bookSet2.add(book2);
        bookSet2.add(book3);
        bookSet2.add(book4);
        bookSet2.add(book5);

        System.out.println("Sort Books by Numbers of Page");
        for (Book book : bookSet2) {
            System.out.println("Name: " + book.getName() + " | Numbers of Page: " + book.getPageNumber());
        }

    }
}