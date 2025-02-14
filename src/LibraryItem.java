public abstract class LibraryItem {
    public String title;
    public String authorOrPublisher;
    public String publicationYear;

    public LibraryItem(String title, String authorOrPublisher, String publicationYear) {
        this.title = title;
        this.authorOrPublisher = authorOrPublisher;
        this.publicationYear = publicationYear;
    }

    public abstract String getDescription();
}
