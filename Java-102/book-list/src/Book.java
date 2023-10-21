public class Book {
    private final String name;
    private final String author;
    private final String publishDate;
    private final int page;

    public Book(String name, String author, String publishDate, int page) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public int getPage() {
        return page;
    }
}
