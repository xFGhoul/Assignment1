public class Book extends LibraryItem {
    public int numberOfPages;

    public Book(String title, String authorOrPublisher, String publicationYear, int numberOfPages) {
        super(title, authorOrPublisher, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public String getDescription() {
        return "Book: " + title + " With: " + numberOfPages + " pages";
    }
}
