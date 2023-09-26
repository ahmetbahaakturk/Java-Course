public class Book implements Comparable<Book> {
    private final String name;
    private final String authorName;
    private final String releaseDate;
    private final int pageNumber;

    Book(String name, String authorName, String releaseDate, int pageNumber) {
        this.name = name;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String toString() {
        return "Name: " + name + "\nAuthor: " + authorName + "\nRelease Date: " + releaseDate + "\nPage: " + pageNumber + "\n--------------------------------------";
    }
}