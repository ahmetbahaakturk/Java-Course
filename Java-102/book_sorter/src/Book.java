public class Book implements Comparable<Book> {
    private String name;
    private String authorName;
    private String releaseDate;
    private int pageNumber;

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

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
