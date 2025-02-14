public class Magazine extends LibraryItem {
    public int issueNumber;

    public Magazine(String title, String authorOrPublisher, String publicationYear, int issueNumber) {
        super(title, authorOrPublisher, publicationYear);
        this.issueNumber = issueNumber;
    }

    public String getDescription() {
        return "Magazine: " + title + " Issue: " + issueNumber;
    }
}
