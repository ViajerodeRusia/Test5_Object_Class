public class Book extends Author {
    private String bookName;
    private int publishingYear;

    public Book(String bookName, int publishingYear, String name) {
        super(name);
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {

        return bookName;
    }

    public int getPublishingYear() {

        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

}
