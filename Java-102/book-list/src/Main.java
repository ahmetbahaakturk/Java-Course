import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", "1960", 77));
        bookList.add(new Book("1984", "George Orwell", "1949", 328));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen", "1813", 279));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", 88));
        bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger", "1951", 277));
        bookList.add(new Book("Moby-Dick", "Herman Melville", "1851", 625));
        bookList.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "1997", 309));
        bookList.add(new Book("The Hobbit", "J.R.R. Tolkien", "1937", 310));
        bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "1954-1955", 1178));
        bookList.add(new Book("Brave New World", "Aldous Huxley", "1932", 288));

        Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getName, Book::getAuthor));
        List<Book> filteredBookList = bookList.stream().filter(book -> book.getPage() > 100).toList();

        System.out.println(bookMap);
        filteredBookList.forEach(i -> System.out.println(i.getName()));

    }
}