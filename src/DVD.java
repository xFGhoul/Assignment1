public class DVD extends LibraryItem {
    public int duration;

    public DVD(String title, String authorOrPublisher, String publicationYear, int duration) {
        super(title, authorOrPublisher, publicationYear);
        this.duration = duration;
    }

    public String getDescription() {
        return "DVD: " + title + " Duration: " + duration;
    }
}
